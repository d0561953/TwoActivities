package com.example.android.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * The TwoActivities app contains two activities and sends messages
 * (intents) between them.
 */
public class MainActivity extends AppCompatActivity{

    private int mCount = 0;
    private TextView mShowCount;
    private Button btnCount;
    public static final String KEY_COUNT = "KEY_COUNT";

    // Class name for Log tag
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Log.d(LOG_TAG, "Count" + mCount);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra( KEY_COUNT, mCount);
        startActivity(intent);
    }

}
