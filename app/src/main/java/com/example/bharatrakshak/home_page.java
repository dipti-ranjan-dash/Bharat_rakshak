package com.example.bharatrakshak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class home_page extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar toolbar;
    View header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.home) {
                    Intent intent = new Intent(home_page.this, home_page.class);
                    startActivity(intent);
                    finish();

                    Toast.makeText(home_page.this, "Hello station master", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.profile) {
                    Intent cartIntent = new Intent(home_page.this, home_page.class);
                    startActivity(cartIntent);

                    Toast.makeText(home_page.this, "Hello Police", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.logout) {
                    Intent aboutIntent = new Intent(home_page.this, home_page.class);
                    startActivity(aboutIntent);
                    Toast.makeText(home_page.this, "Hello admin ", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });
    }

    public void crowd(View v) {
        Intent i = new Intent(home_page.this, crowd.class);
        startActivity(i);

    }
    public void crime(View v) {
        Intent i = new Intent(home_page.this, crime.class);
        startActivity(i);

    }
    public void clean(View v) {
        Intent i = new Intent(home_page.this, clean.class);
        startActivity(i);

    }

    public void platform(View v) {
        Intent i = new Intent(home_page.this, platform.class);
        startActivity(i);

    }

    public void live(View v) {
        Intent i = new Intent(home_page.this, live.class);
        startActivity(i);

    }

}