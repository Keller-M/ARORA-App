package com.example.aorora.model;

import com.google.gson.annotations.SerializedName;

public class ButterflyLike {

    /*
    |–> butteefly_like_id (integer)
|–> butterfly_id* (integer)
|–> user_id* (integer)
|–> like_created_at (datetime)
     */
    @SerializedName("butterfly_like_id")
    private Integer butterfly_like_id;
    @SerializedName("butterfly_id")
    private Integer butterfly_id;
    @SerializedName("user_id")
    private Integer user_id;
    @SerializedName("like_created_at")
    private String like_created_at;


    public ButterflyLike(Integer butteefly_like_id, Integer butterfly_id, Integer user_id, String like_created_at) {
        this.butterfly_like_id = butteefly_like_id;
        this.butterfly_id = butterfly_id;
        this.user_id = user_id;
        this.like_created_at = like_created_at;
    }


    public Integer getButteefly_like_id() {
        return butterfly_like_id;
    }

    public void setButteefly_like_id(Integer butteefly_like_id) {
        this.butterfly_like_id = butteefly_like_id;
    }

    public Integer getButterfly_id() {
        return butterfly_id;
    }

    public void setButterfly_id(Integer butterfly_id) {
        this.butterfly_id = butterfly_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLike_created_at() {
        return like_created_at;
    }

    public void setLike_created_at(String like_created_at) {
        this.like_created_at = like_created_at;
    }
}
