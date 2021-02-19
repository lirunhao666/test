package com.gwm.entity;

import org.springframework.stereotype.Component;

@Component
public class User {

    private Integer admin_id;
    private String admin_name;
    private Integer status;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "User{" +
                "admin_id=" + admin_id +
                ", admin_name='" + admin_name + '\'' +
                ", status=" + status +
                '}';
    }
}
