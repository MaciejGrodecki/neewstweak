package com.example.macie_000.neewstweak;

import java.io.Serializable;

/**
 * Created by macie_000 on 2015-06-14.
 */
public class News implements Serializable{
    private String title;
    private String description;
    private String link;

    public News(String title, String description, String link){
        this.setTitle(title);
        this.setDescription(description);
        this.setLink(link);
    }

    public News(){}


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
