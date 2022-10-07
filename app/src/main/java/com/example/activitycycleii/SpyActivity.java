package com.example.activitycycleii;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Classe qui permet l'espionnage sur les activités.
 */
public class SpyActivity extends AppCompatActivity {
    /**
     * Constante pour le tag : ACTIVITY CYCLE
     */
    private static final String TAG_AC = "ACTIVITY CYCLE";
    /**
     * Espion sur onCreate()
     * @param savedInstanceState Bundle
     */
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG_AC, "onCreate (bundle : " + savedInstanceState + ")");
    }

    /**
     * Espion sur onStart()
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG_AC, "onStart");
    }

    /**
     * Espion sur onResume()
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG_AC, "onResume");
    }

    /**
     * Espion sur onPause
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG_AC, "onPause");
    }

    /**
     * Espion sur onStop()
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG_AC, "onStop");
    }

    /**
     * Espion sur onDestroy()
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG_AC, "onDestroy");
    }

    /**
     * Espion sur onRestart
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG_AC, "onRestart");
    }
}
