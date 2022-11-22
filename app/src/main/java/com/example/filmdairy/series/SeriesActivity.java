package com.example.filmdairy.series;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.filmdairy.R;

import java.util.ArrayList;

public class SeriesActivity extends AppCompatActivity {

    public RecyclerView seriesRv;
    public ArrayList<Series> seriesList;
    public SeriesAdapter seriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        getSupportActionBar().setTitle("Series");
        setupData();
        setupSeriesRecyclerView();
    }

    public void setupData() {
        seriesList = new ArrayList<>();

        Series panda = new Series();
        panda.seriesId = 1;
        panda.imageUrl = "https://occ-0-1556-1007.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABduFRBhx6t-Dhqq_nz4teWtFQs7rpEnkYggmaKnJ1jjtbaGGqVSTZi1OfHu6DkmLzO7d5bXlhKYE1Eu6jrJoaO64l0uKJY2YEHJb.jpg?r=109";
        panda.title = "Kung Fu Panda Movie Series";
        seriesList.add(panda);

        Series harry = new Series();
        harry.seriesId = 2;
        harry.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/3/36/Harry-potter-films.png/revision/latest/scale-to-width-down/1000?cb=20110722151247";
        harry.title = "Harry Potter Movie Series";
        seriesList.add(harry);
    }

    public void setupSeriesRecyclerView() {
        seriesRv = findViewById(R.id.series_rv);
        seriesRv.setLayoutManager(new LinearLayoutManager(this));
        seriesAdapter = new SeriesAdapter();
        seriesAdapter.setData(seriesList);
        seriesRv.setAdapter(seriesAdapter);
    }
}