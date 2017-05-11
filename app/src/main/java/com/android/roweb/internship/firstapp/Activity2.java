package com.android.roweb.internship.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    private String TAG = Activity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate method was invoked");
        setContentView(R.layout.activity_2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart method was invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume method was invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause method was invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop method was invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart method was invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy method was invoked");
    }

    Bundle extras = getIntent().getExtras();

    if (extras != null){
        String nume = extras.getString("Name");
    }

}
