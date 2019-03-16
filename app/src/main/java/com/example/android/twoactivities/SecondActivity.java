package com.example.android.twoactivities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mShowCount;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mShowCount = findViewById(R.id.tv_Counter);
        Intent intent = getIntent();
        int values = intent.getIntExtra(MainActivity.KEY_COUNT,1);
        Log.d(LOG_TAG, "Count: " + values);
        String s = String.valueOf(values);
        mShowCount.setText(s);
    }

}
