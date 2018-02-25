package com.example.arif.arif_1202154205_m3;

/**
 * Created by arif on 25/02/2018.
 */

public class air {
        String title, description, detail;
    int image;

public air(String title, String description, String detail, int image){
        this.title= title;
        this.description=description;
        this.detail= detail;
        this.image= image;

        }

public String getTitle() {
        return title;
        }

public String getDescpription() {
        return description;
        }

public String getDetail() {
        return detail;
        }

public int getImage() {
        return image;
        }

}
