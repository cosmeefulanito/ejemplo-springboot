package com.alwayson.propertymanager.controller;

import com.alwayson.propertymanager.dao.*;
import com.alwayson.propertymanager.dto.Notification;
import com.alwayson.propertymanager.dto.User;
import com.alwayson.propertymanager.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping ("/api")


@EnableJpaRepositories("com.alwayson.propertymanager.dao")
@EntityScan("com.alwayson.propertymanager.dto")



public class ApiController {

    @Autowired
    PropertyDao propertyDao;
    @Autowired
    MediaDao mediaDao;
    @Autowired
    NotificationDao notificationDao;
    @Autowired
    OfficeSaleDao officeSaleDao;
    @Autowired
    ScheduleVisitDao scheduleVisitDao;
    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/registro", method = RequestMethod.POST)
    public ResponseEntity<JsonResponse> registro(HttpServletRequest request, @RequestBody User user){
        user.setToken(getToken());
        userDao.save(user);

        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setDataDos(user);

        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
    }

    @RequestMapping (value = "/login", method = RequestMethod.POST)
    public ResponseEntity<JsonResponse> login (HttpServletRequest request, @RequestBody User user){
        User userValidate = null;
        JsonResponse jsonResponse = new JsonResponse();
        userValidate = userDao.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if(userValidate != null) {
            userValidate.setToken(getToken());
            userDao.save(userValidate);
            jsonResponse.setDataDos(userValidate);
        }

       else{
        jsonResponse.setError(true);
        jsonResponse.setMensaje("Datos Incorrectos CTM");
        }
       return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
    }


    public String getToken(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 40;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return  generatedString;
    }


}