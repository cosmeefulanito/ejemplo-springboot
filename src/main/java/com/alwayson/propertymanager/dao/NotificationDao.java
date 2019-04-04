package com.alwayson.propertymanager.dao;

import com.alwayson.propertymanager.dto.Notification;
import org.springframework.data.repository.CrudRepository;

public interface NotificationDao extends CrudRepository<Notification,Long> {
}
