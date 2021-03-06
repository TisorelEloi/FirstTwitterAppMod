package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {
    public String name;
    public Long uid;
    public String screenname;
    public String profilImageUrl;

    public static User fromJSON(JSONObject jsonObject) throws JSONException {
        User user = new User();

        user.name = jsonObject.getString("name");
        user.uid = jsonObject.getLong("id");
        user.screenname= jsonObject.getString("screen_name");
        user.profilImageUrl = jsonObject.getString("profile_image_url");
        return user;

    }


}
