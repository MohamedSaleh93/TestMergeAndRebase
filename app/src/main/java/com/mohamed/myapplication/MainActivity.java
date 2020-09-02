package com.mohamed.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test", "1");
        Log.d("test", "4");
        Log.d("test", "5");
        Log.d("test", "6");
        Log.d("test", "77");
        
    }
}