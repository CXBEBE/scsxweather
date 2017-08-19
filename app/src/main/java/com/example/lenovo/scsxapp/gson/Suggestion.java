package com.example.lenovo.scsxapp.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/8/18.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carwash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
