package com.alwayson.propertymanager.dto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long Id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private String price;

    @Column(name="address")
    private String address;

    @Column (name="meters_built")
    private String meters_built;

    @Column (name="total_meters")
    private String total_meters;

    @Column (name="bedrooms")
    private String bedrooms;

    @Column (name="objetive")
    private String objetive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    User user;


    /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="notification_id", nullable = false)
    Notification notification;*/


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "property")
    List<Media> mediaList;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="office_sale_id", nullable = false)
    OfficeSale officeSale;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "property")
    List<ScheduleVisit> ScheduleVisit;



    public Property() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMeters_built() {
        return meters_built;
    }

    public void setMeters_built(String meters_built) {
        this.meters_built = meters_built;
    }

    public String getTotal_meters() {
        return total_meters;
    }

    public void setTotal_meters(String total_meters) {
        this.total_meters = total_meters;
    }

    public String getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(String bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getObjetive() {
        return objetive;
    }

    public void setObjetive(String objetive) {
        this.objetive = objetive;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /*public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }*/

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public OfficeSale getOfficeSale() {
        return officeSale;
    }

    public void setOfficeSale(OfficeSale officeSale) {
        this.officeSale = officeSale;
    }

    public List<com.alwayson.propertymanager.dto.ScheduleVisit> getScheduleVisit() {
        return ScheduleVisit;
    }

    public void setScheduleVisit(List<com.alwayson.propertymanager.dto.ScheduleVisit> scheduleVisit) {
        ScheduleVisit = scheduleVisit;
    }

}

