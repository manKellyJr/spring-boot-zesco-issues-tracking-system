package com.example.equipmentmanager.model;

import javax.persistence.*;

@Entity
public class Issues {
    @Id
    @GeneratedValue
    private long id;


    private String equipment;
    private String description;
    private String location;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
