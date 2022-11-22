package com.example.filmdairy.movie;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("_id")
    public String id;
    public String description;
    public int seriesId;
    public int movieId;
    public String imageUrl;
    @SerializedName("name")
    public String title;
}
