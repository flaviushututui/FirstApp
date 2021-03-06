package com.android.roweb.internship.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private String TAG = Activity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("AWESOME_TAG", "onCreate method was invoked");
        setContentView(R.layout.activity_2);
        setText();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart method was invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop method was invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume method was invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause method was invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart method was invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy method was invoked");
    }

    private String getTextFromActivity(){
        Log.e(TAG, "getTextFromActivity method was invoked");
        Bundle extras = getIntent().getExtras();
        String text = "";
        if (extras!= null){
            text = extras.getString("Name");
        }
        return text;
    }

    private void setText(){
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(getTextFromActivity());
        Log.e(TAG, "setText method was invoked");
    }

    // Metoda ce face posibila trecerea inapoi la Main Activity
    // si e sincronizata cu butonul BACK
    public void goBackButton(View view){
        Intent intent = new Intent(Activity2.this, MainActivity1.class);
        startActivity(intent);
        Log.e(TAG, "goBackButton method was invoked");
    }
}
