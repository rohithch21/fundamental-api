package com.personal.projects.ecommerce.fundamentalapi.entity;

public class UploadResponse {
    private String id; // conert this to a UUID later based on the response of WorkLoad Manager
    private String Status;

    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
