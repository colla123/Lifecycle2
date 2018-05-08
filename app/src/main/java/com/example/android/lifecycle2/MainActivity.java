package com.example.android.lifecycle2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Activity is created", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity is started", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onStart");
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Toast.makeText(this, "Activity is Restarted", Toast.LENGTH_SHORT).show();
        Log.i("onRestart():","Activity Restarted");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity is Resumed", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity is Paused", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity is Stopped", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity is Destroyed", Toast.LENGTH_SHORT).show();
        Log.v("MainActivity", "onDestroy");
    }
}