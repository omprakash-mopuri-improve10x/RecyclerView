package com.example.filmdairy.series;

import com.google.gson.annotations.SerializedName;

public class Series {
    @SerializedName("_id")
    public String id;
    @SerializedName("id")
    public int seriesId;
    public String imageUrl;
    public String title;
}
