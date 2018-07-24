package com.codepath.apps.restclienttemplate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.models.Tweet;

import java.util.List;

public class TweetAdapter extends  RecyclerView.Adapter<TweetAdapter.ViewHolder>{
    private List<Tweet> mTweet;
    Context context;
    public TweetAdapter(List<Tweet> tweets){
        this.mTweet = tweets;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context  = parent.getContext();
        LayoutInflater  inflater = LayoutInflater.from(context);
        View tweetView = inflater.inflate(R.layout.item_tweet, parent, false);
        ViewHolder viewHolder = new ViewHolder(tweetView);
        return viewHolder;

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Tweet tweet = mTweet.get(position);
        holder.tvUserName.setText(tweet.user.name);
        holder.tvBody.setText(tweet.body);
        Glide.with(context).load(tweet.user.profilImageUrl).into(holder.ivProfileImage);

    }

    @Override
    public int getItemCount() {
        return mTweet.size();
    }

    public  static  class  ViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivProfileImage;
        public TextView  tvUserName;
        public TextView  tvBody;

        public ViewHolder(View itemView){
            super(itemView);

             ivProfileImage = itemView.findViewById(R.id.ivProfileImage);
             tvUserName =  itemView.findViewById(R.id.tvUserName);
             tvBody = itemView.findViewById(R.id.tvBody);
        }

    }
}
