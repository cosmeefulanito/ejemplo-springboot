package com.alwayson.propertymanager.dto;
import javax.persistence.*;

@Entity
@Table(name="media")


public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long Id;

    @Column(name="name")
    private String name;

    @Column(name="url")
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="property_id", nullable = false)
    Property property;

    public Media() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }


}

