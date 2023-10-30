package com.example.bharatrakshak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class platform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platform);
    }

    public void work(View v) {
        Intent i = new Intent(platform.this, work.class);
        startActivity(i);

    }
}