package com.example.anshuman_hp.institute;

/**
 * Created by Anshuman-HP on 29-03-2017.
 */

public class timelinepost {
    String userUrl;
    String username;
    String collegename;
    String ImageUrl;
    String descp;
    String num_likes;
    String num_dislikes;
    String num_attending;

    public timelinepost(String userUrl, String username, String collegename, String imageUrl, String descp, String num_likes, String num_dislikes, String num_attending) {
        this.userUrl = userUrl;
        this.username = username;
        this.collegename = collegename;
        ImageUrl = imageUrl;
        this.descp = descp;
        this.num_likes = num_likes;
        this.num_dislikes = num_dislikes;
        this.num_attending = num_attending;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public String getNum_likes() {
        return num_likes;
    }

    public void setNum_likes(String num_likes) {
        this.num_likes = num_likes;
    }

    public String getNum_dislikes() {
        return num_dislikes;
    }

    public void setNum_dislikes(String num_dislikes) {
        this.num_dislikes = num_dislikes;
    }

    public String getNum_attending() {
        return num_attending;
    }

    public void setNum_attending(String num_attending) {
        this.num_attending = num_attending;
    }
}
