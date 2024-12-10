package com.ireddragonicy.laptoptrack;

public class Laptop {
    private String id;
    private String model;
    private String status;
    private String drawerLocation;

    public Laptop(String id, String model, String status, String drawerLocation) {
        this.id = id;
        this.model = model;
        this.status = status;
        this.drawerLocation = drawerLocation;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getStatus() {
        return status;
    }

    public String getDrawerLocation() {
        return drawerLocation;
    }
}
