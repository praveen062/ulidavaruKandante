package com.conflux.finflux.finflux.offline.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.conflux.finflux.finflux.R;
import com.conflux.finflux.finflux.util.Logger;
import com.squareup.otto.Subscribe;

import java.util.ArrayList;
import java.util.Date;

public class FetchCollection extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_collection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Subscribe
    public void datePickedEvent(ArrayList<Date> dates){
        Logger.d(TAG,"The Selected Dates are "+dates);
    }

}
