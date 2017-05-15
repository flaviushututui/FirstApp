package com.android.roweb.internship.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity1 extends AppCompatActivity {

    private String TAG = MainActivity1.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);
        Log.e(TAG, "onCreate method was invoked");
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

    // Metoda ce preia textul introdus in EditTextView
    private String getTextFromET(){
        Log.e(TAG, " getTextFromET method was invoked");
        EditText yourText = (EditText) findViewById(R.id.edit_text_view);
        return yourText.getText().toString();
    }

    // Metoda ce preia textul returnat de metoda getTextFromET si creeaza o noua activitate
    // si e sincronizata cu butonul GENERATE VIEW
    public void generateActivity(View view){
        Intent intent = new Intent(MainActivity1.this, Activity2.class);
        intent.putExtra("Name", getTextFromET());
        startActivity(intent);
        Log.e(TAG, "generateActivity method was invoked");
    }
}
