package com.alwayson.propertymanager.dto;

import javax.persistence.*;

@Entity
@Table (name="schedulevisit")

public class ScheduleVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    @Column(name="id")
    private Long Id;

    @Column(name="date")
    private String date;

    @Column(name="description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="office_sale_id", nullable = false)
    OfficeSale officeSale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="property_id", nullable = false)
    Property property;


    public ScheduleVisit() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public OfficeSale getOfficeSale() {
        return officeSale;
    }

    public void setOfficeSale(OfficeSale officeSale) {
        this.officeSale = officeSale;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

}
