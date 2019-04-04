package com.alwayson.propertymanager.dao;

        import com.alwayson.propertymanager.dto.Property;
        import org.springframework.data.repository.CrudRepository;

public interface PropertyDao extends CrudRepository <Property, Long> {
}
