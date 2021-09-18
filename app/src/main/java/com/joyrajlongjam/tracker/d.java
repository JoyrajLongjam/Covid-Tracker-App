package com.joyrajlongjam.tracker;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class d extends AppCompatActivity {
    private  int positionCountry;
    TextView Country,Cases,Recovered,Critical,Active,TodayCases,TotalDeaths,TodayDeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);
        getSupportActionBar().setTitle("Details of "+affected.countryModelsList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Recovered = findViewById(R.id.Recovered);
        Country = findViewById(R.id.Country);
        Cases = findViewById(R.id.Cases);
        Critical = findViewById(R.id.Critical);
        Active = findViewById(R.id.Active);
        TodayCases = findViewById(R.id.TodayCases);
        TotalDeaths = findViewById(R.id.Deaths);
        TodayDeaths = findViewById(R.id.TodayDeaths);

        Recovered.setText(affected.countryModelsList.get(positionCountry).getRecovered());
        Country.setText(affected.countryModelsList.get(positionCountry).getCountry());
        Cases.setText(affected.countryModelsList.get(positionCountry).getCases());
        Critical.setText(affected.countryModelsList.get(positionCountry).getCritical());
        Active.setText(affected.countryModelsList.get(positionCountry).getActive());
        TodayCases.setText(affected.countryModelsList.get(positionCountry).getTodayCases());
        TotalDeaths.setText(affected.countryModelsList.get(positionCountry).getDeaths());
        TodayDeaths.setText(affected.countryModelsList.get(positionCountry).getTodayDeaths());
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}