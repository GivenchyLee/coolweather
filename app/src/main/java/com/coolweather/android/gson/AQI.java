package com.coolweather.android.gson;

/**
 * Created by givenchylee on 2017/1/7.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
