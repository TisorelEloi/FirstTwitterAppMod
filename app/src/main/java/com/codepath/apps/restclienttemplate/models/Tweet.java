package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Tweet {

    // Liste sans Attribut
   public String body;
   public Long uid;  //Identifiant base de donnees
    public User user;
    public String createdAt;

    public static  Tweet fromJson(JSONObject jsonObject)throws JSONException{
        Tweet tweet = new Tweet();
        tweet.body = jsonObject.getString("text");
        tweet.uid =jsonObject.getLong("id");
        tweet.createdAt = jsonObject.getString("created_at");
        tweet.user = User.fromJSON(jsonObject.getJSONObject("user"));
        return  tweet;

    }



}
