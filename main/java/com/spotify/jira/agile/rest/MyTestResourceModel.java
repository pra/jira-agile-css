package com.spotify.jira.agile.rest;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class MyTestResourceModel {

    @XmlElement(name = "value")
    private String message;

    public MyTestResourceModel() {
    }

    public MyTestResourceModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}