package com.ireddragonicy.laptoptrack;

public class Assignment {
    private String laptopId;
    private String laptopModel;
    private String status;
    private String date;

    public Assignment(String laptopId, String laptopModel, String status, String date) {
        this.laptopId = laptopId;
        this.laptopModel = laptopModel;
        this.status = status;
        this.date = date;
    }

    // Getters
    public String getLaptopId() {
        return laptopId;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }
}
