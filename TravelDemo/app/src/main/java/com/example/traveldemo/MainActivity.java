package com.example.traveldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 location=findViewById(R.id.viewPager);
        List<TravelLocation>travelLocations=new ArrayList<>();
        TravelLocation france=new TravelLocation();
        france.imageUrl="https://www.infinityandroid.com/images/france_eiffel_tower.jpg";
        france.title="France";
        france.location="Eiffel Tower";
        france.starRating=4.8f;
        travelLocations.add(france);
        TravelLocation mountain=new TravelLocation();
        mountain.imageUrl="https://www.infinityandroid.com/images/indonesia_mountain_view.jpg";
        mountain.title="İndonesia";
        mountain.location="Mountain View";
        mountain.starRating=4.5f;
        travelLocations.add(mountain);
        TravelLocation tacMahal= new TravelLocation();
        tacMahal.imageUrl="https://www.infinityandroid.com/images/india_taj_mahal.jpg";
        tacMahal.title="Tac Mahal";
        tacMahal.location="Hindistan";
        tacMahal.starRating=4.7f;
        travelLocations.add(tacMahal);
        TravelLocation  lakeView= new TravelLocation();
        lakeView.imageUrl="https://www.infinityandroid.com/images/canada_lake_view.jpg";
        lakeView.title="Lake";
        lakeView.location="Canada";
        lakeView.starRating=4.7f;
        travelLocations.add(lakeView);
        location.setAdapter(new TravelLocationAdapter(travelLocations));
    }



}