package com.penorpaper.views;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Chandu on 3/1/2015.
 */
public class BaseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }
}

