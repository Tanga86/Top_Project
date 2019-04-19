package com.opportunity.dto;

import javax.persistence.*;

@Entity
@Table(name =  "mechanic")
public class Mechanic {

    @Id
    @Column(  name = "mech_id")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer mechId;

    @Column( name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Integer experience;
    private String position;

    @Column( name = "photo_path")
    private String photoPath;

    public Integer getMechId() {
        return mechId;
    }

    public void setMechId(Integer mechId) {
        this.mechId = mechId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLatsName() {
        return lastName;
    }

    public void setLatsName(String latsName) {
        this.lastName = latsName;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}