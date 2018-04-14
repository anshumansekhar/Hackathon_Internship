package com.example.anshuman_hp.internship;

/**
 * Created by Anshuman-HP on 02-04-2017.
 */

public class internshipdetails {
    String name;
    String url;

    public internshipdetails(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
