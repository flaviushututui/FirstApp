package com.android.roweb.internship.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    private String TAG = Activity1.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("AWESOME_TAG", "onCreate method was invoked");
        setContentView(R.layout.activity_1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart method was invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop method was invoked");
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
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart method was invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy method was invoked");
    }

    private String setYourText(){
        EditText yourName = (EditText) findViewById(R.id.edit_text_view);
        return yourName.getText().toString();
    }

    public void generateActivity(View view){
        Intent intent = new Intent(Activity1.this, Activity2.class);
        intent.putExtra("Name", setYourText());
        startActivity(intent);
    }
}
