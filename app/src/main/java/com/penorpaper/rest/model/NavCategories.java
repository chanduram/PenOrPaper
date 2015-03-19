package com.penorpaper.rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chandu on 3/7/2015.
 */
public class NavCategories {
    @Expose
    private String title;
    @Expose
    private String error;
    @Expose
    private String icon;
    @Expose
    private String logo;
    @Expose
    private String search;
    @SerializedName("filter_category_id")
    @Expose
    private String filterCategoryId;
    @SerializedName("filter_sub_category")
    @Expose
    private Boolean filterSubCategory;
    @SerializedName("sub_category_url")
    @Expose
    private String subCategoryUrl;
    @Expose
    private List<Category> categories = new ArrayList<Category>();

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The error
     */
    public String getError() {
        return error;
    }

    /**
     * @param error The error
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * @return The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return The logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo The logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return The search
     */
    public String getSearch() {
        return search;
    }

    /**
     * @param search The search
     */
    public void setSearch(String search) {
        this.search = search;
    }

    /**
     * @return The filterCategoryId
     */
    public String getFilterCategoryId() {
        return filterCategoryId;
    }

    /**
     * @param filterCategoryId The filter_category_id
     */
    public void setFilterCategoryId(String filterCategoryId) {
        this.filterCategoryId = filterCategoryId;
    }

    /**
     * @return The filterSubCategory
     */
    public Boolean getFilterSubCategory() {
        return filterSubCategory;
    }

    /**
     * @param filterSubCategory The filter_sub_category
     */
    public void setFilterSubCategory(Boolean filterSubCategory) {
        this.filterSubCategory = filterSubCategory;
    }

    /**
     * @return The subCategoryUrl
     */
    public String getSubCategoryUrl() {
        return subCategoryUrl;
    }

    /**
     * @param subCategoryUrl The sub_category_url
     */
    public void setSubCategoryUrl(String subCategoryUrl) {
        this.subCategoryUrl = subCategoryUrl;
    }

    /**
     * @return The categories
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * @param categories The categories
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /* Get the group count*/
    public int getGroupCount() {

        return categories != null ? categories.size() : 0;
    }

    /*Get the child count at the group groupPostion*/
    public int getChildCount(int groupPostion) {
        if (categories != null && categories.size() > 0) {
            return categories.get(groupPostion).getSubCategory().size();
        }
        return 0;

    }

    public Category getCategory(int cat_pos) {

        return categories.get(cat_pos);
    }

    public SubCategory getSubCategory(int cat_pos, int sub_pos) {

        return categories.get(cat_pos).getSubCategory().get(sub_pos);
    }
}
