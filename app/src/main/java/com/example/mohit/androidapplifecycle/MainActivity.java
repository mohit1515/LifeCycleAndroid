package com.example.mohit.androidapplifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //to override methods for observing the flow of application : Ctrl+o is used
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("msg", "On Create Invoked");
        Toast.makeText(this, "On create Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        Log.d("msg", "On restart Invoked");
        Toast.makeText(this, "On restart Invoked", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d("msg", "On start Invoked");
        Toast.makeText(this, "On start Invoked", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d("msg", "On stop Invoked");
        Toast.makeText(this, "On stop Invoked", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("msg", "On destroy Invoked");
        Toast.makeText(this, "On destroy Invoked", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.d("msg", "On resume Invoked");
        Toast.makeText(this, "On resume Invoked", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {

        Log.d("msg", "On pause Invoked");
        Toast.makeText(this, "On pause Invoked", Toast.LENGTH_SHORT).show();
        super.onPause();
    }
}
