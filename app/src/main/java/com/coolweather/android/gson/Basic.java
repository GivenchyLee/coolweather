package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by givenchylee on 2017/1/7.
 */

public class Basic {
    /**
     * 由于JSON(JavaScript Object Notation)中的一些字段可能不太适合直接作为java字段来命名，因此我们这里使用了
     * @SerializedNmae 注解的方式来让JSON字段和JAVA字段之间建立映射关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
