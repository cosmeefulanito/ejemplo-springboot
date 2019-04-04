package com.alwayson.propertymanager.dao;
import com.alwayson.propertymanager.dto.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;



public interface UserDao extends CrudRepository<User,Long>

{
    public User findByEmailAndPassword (String email, String password);

    public User findByToken(String token);

   // @Query ("SELECT u.name FROM user u")
    //public List<String> getNombres();
}
