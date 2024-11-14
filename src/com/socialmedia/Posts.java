package com.socialmedia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

abstract class Posts {
    private Date date;
    private List<Comments> comments;


    public Posts() {
        this.date = new Date();
        this.comments = new ArrayList<>();
    }

    //public void addComment(Comments comment) {
    //    comments.add(comment);
    //}
//
//
    //public List<Comments> getComments() {
    //    return comments;
    //}
//
    //public int commentsNumber() {
    //    return comments.size();
    //}
//
    //public Date getDate() {
    //    return date;
    //}

}


