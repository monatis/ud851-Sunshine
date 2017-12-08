package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mDetailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();
        mDetailTextView = (TextView) findViewById(R.id.tv_detail);
        if(intent.hasExtra("EXTRA_DETAIL")) {
            String detail = intent.getStringExtra("EXTRA_DETAIL");
            mDetailTextView.setText(detail);
        }
    }
}