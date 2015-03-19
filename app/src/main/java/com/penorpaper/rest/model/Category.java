package com.penorpaper.rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chandu on 3/7/2015.
 */
public class Category {

    @Expose
    private String name;
    @Expose
    private Boolean image;
    @Expose
    private String column;
    @Expose
    private String id;
    @SerializedName("child_service_url")
    @Expose
    private String childServiceUrl;
    @Expose
    private List<SubCategory> children = new ArrayList<SubCategory>();
    private boolean isExpanded;

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The image
     */
    public Boolean getImage() {
        return image;
    }

    /**
     * @param image The image
     */
    public void setImage(Boolean image) {
        this.image = image;
    }

    /**
     * @return The column
     */
    public String getColumn() {
        return column;
    }

    /**
     * @param column The column
     */
    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The childServiceUrl
     */
    public String getSubCatServiceUrl() {
        return childServiceUrl;
    }

    /**
     * @param childServiceUrl The child_service_url
     */
    public void setSubCatServiceUrl(String childServiceUrl) {
        this.childServiceUrl = childServiceUrl;
    }

    /**
     * @return The children
     */
    public List<SubCategory> getSubCategory() {
        return children;
    }

    /**
     * @param children The children
     */
    public void setSubCategory(List<SubCategory> children) {
        this.children = children;
    }

    /*Check wheter the list is expanded*/
    public boolean isExpanded() {
        return isExpanded;
    }
}
