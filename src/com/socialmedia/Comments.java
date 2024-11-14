package com.socialmedia;

import java.util.Date;

public class Comments {
    private String comment;
    private Date date;
    private String user;

    public Comments(String text, int date, String author) {
        this.comment = text;
        this.date = new Date();
        this.user = author;
    }

    @Override
    public String toString() {
        return "· " + user + " in " + date + ": " + comment;
    }

     //public String getComment() {
     //    return comment;
     //}
//
     //public Date getDate() {
     //    return date;
     //}



}
