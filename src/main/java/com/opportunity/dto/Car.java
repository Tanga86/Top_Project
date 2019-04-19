package com.opportunity.dto;


import javax.persistence.*;

@Entity
@Table(name="car")
public class Car {
    @Id
    @Column (name="car_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer carid;
    private String model;
    private String vin;
    @Column (name="days_to_finish")
    private  Integer daysToFIinish;
    private String  description;
    @Column (name="photo_path")
    private String  photopath;

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getDaysToFIinish() {
        return daysToFIinish;
    }

    public void setDaysToFIinish(Integer daysToFIinish) {
        this.daysToFIinish = daysToFIinish;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photopath;
    }

    public void setPhoto(String photo) {
        this.photopath = photopath;
    }
}
