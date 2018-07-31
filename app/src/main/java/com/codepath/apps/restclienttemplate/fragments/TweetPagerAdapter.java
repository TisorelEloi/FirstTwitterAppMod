package com.codepath.apps.restclienttemplate.fragments;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TweetPagerAdapter extends FragmentPagerAdapter {
 private String tabTitles[] = new String[] {"Home", "Mentions"};
Context context;
 public TweetPagerAdapter(FragmentManager fm, Context context){
     super(fm);
     this.context = context;
 }
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int position) {
        if (position ==0 ){
            return new HomeTimelineFragment();
        }else if (position  == 1){
            return  new MentionsTimelineFragment();

        }else {
            return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
