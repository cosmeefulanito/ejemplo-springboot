package com.alwayson.propertymanager.dto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long Id;

    @Column(name="description")
    private String description;

    @Column(name="title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    User user;

    /* @OneToMany(fetch = FetchType.LAZY, mappedBR = "notification")

    List<Property> propertyList;*/

    public Notification() {
    }

    public Notification(Long id, String description, String title) {
        Id = id;
        this.description = description;
        this.title = title;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /* public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }
*/

}
