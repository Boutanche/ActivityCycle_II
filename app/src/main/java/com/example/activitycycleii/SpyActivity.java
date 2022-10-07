package com.example.activitycycleii;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SpyActivity extends AppCompatActivity {
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ACTIVITY CYCLE", "onCreate (bundle : " + savedInstanceState + ")");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ACTIVITY CYCLE", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ACTIVITY CYCLE", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ACTIVITY CYCLE", "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ACTIVITY CYCLE", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ACTIVITY CYCLE", "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ACTIVITY CYCLE", "onRestart");
    }
}
