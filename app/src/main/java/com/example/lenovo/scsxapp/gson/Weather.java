package com.example.lenovo.scsxapp.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by lenovo on 2017/8/18.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
