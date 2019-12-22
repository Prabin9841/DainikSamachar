


package com.example.dainiksamachar;



import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;



import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.navigation.NavigationView;


public class home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView =findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.open, R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

    }















    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.nav_politics:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new politicsfrag()).commit();
                break;
            case R.id.nav_sports:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new sportsfrag()).commit();
                break;

            case R.id.nav_economy:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new economyfrag()).commit();
                break;
            case R.id.nav_entertaintment:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new entertaintmentfrag()).commit();
                break;
            case R.id.nav_health:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new healthfrag()).commit();
                break;
            case R.id.nav_science:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new sciencefrag()).commit();
                break;
            case R.id.nav_international:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new internationalfrag()).commit();
                break;

            case R.id.nav_miscellanous:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new miscellanousfrag()).commit();
                break;
            case R.id.nav_calendar:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new calendarfrag()).commit();
                break;
            case R.id.nav_horoscope:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new horoscopefrag()).commit();
                break;

            case R.id.nav_calculator:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new calculatorfrag()).commit();
                break;
            case R.id.nav_videos:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new videosfrag()).commit();
                break;
            case R.id.nav_photo:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new photofrag()).commit();
                break;
            case R.id.nav_epaper:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new epaperfrag()).commit();
                break;
            case R.id.nav_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new settingsfrag()).commit();
                break;

            case R.id.nav_about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new aboutfrag()).commit();
                break;


            case R.id.nav_contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new contactfrag()).commit();
                break;




        }

            drawer.closeDrawer(GravityCompat.START);


        return true;
    }

    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



}