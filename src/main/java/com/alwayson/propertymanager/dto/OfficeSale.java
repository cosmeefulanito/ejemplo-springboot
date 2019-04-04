package com.alwayson.propertymanager.dto;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="officesale")



public class OfficeSale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="id")
    private Long Id;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "officeSale")
    List<Property> propertyList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "officeSale")
    List<ScheduleVisit> scheduleVisitList;




    public OfficeSale() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public List<ScheduleVisit> getScheduleVisitList() {
        return scheduleVisitList;
    }

    public void setScheduleVisitList(List<ScheduleVisit> scheduleVisitList) {
        this.scheduleVisitList = scheduleVisitList;
    }


}




