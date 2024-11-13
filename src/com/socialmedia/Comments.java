package com.socialmedia;

import java.util.Date;

public class Comments {
    private String comment;
    private Date date;
    private User user;

    public Comments(String texto, User propietario) {
        this.comment = comment;
        this.date = new Date(); // Fecha actual
        this.user = propietario;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }
}
