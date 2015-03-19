package com.penorpaper.rest.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Chandu on 3/7/2015.
 */
public class SubCategory {

    @SerializedName("name")
    private String sub_cat_name;
    @SerializedName("id")
    private String sub_cat_id;

    public String getSub_cat_name() {
        return sub_cat_name;
    }

    public void setSub_cat_name(String sub_cat_name) {
        this.sub_cat_name = sub_cat_name;
    }

    public String getSub_cat_id() {
        return sub_cat_id;
    }

    public void setSub_cat_id(String sub_cat_id) {
        this.sub_cat_id = sub_cat_id;
    }
}
