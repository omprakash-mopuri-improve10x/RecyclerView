package com.example.filmdairy.advancedseries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.filmdairy.R;

import java.util.ArrayList;

public class AdvancedSeriesActivity extends AppCompatActivity {

    public RecyclerView seriesRv;
    public ArrayList<AdvancedSeries> moviesList;
    AdvancedSeriesAdapter advancedSeriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_series);
        getSupportActionBar().setTitle("Series");
        setupData();
        setupSeriesRecyclerView();
    }

    public void setupData() {
        moviesList = new ArrayList<>();

        AdvancedSeries harry1 = new AdvancedSeries();
        harry1.seriesId = 2;
        harry1.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220 ";
        harry1.title = "Harry potter and the sorcerer's Stone";
        moviesList.add(harry1);

        AdvancedSeries harryPotter2 = new AdvancedSeries();
        harryPotter2.seriesId = 2;
        harryPotter2.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        harryPotter2.title = "Harry potter and the chamber of secrets";
        moviesList.add(harryPotter2);

        AdvancedSeries harryPotter3 = new AdvancedSeries();
        harryPotter3.seriesId = 2;
        harryPotter3.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";
        harryPotter3.title = "Harry potter and the prisoner of azkaban";
        moviesList.add(harryPotter3);

        AdvancedSeries harryPotter4 = new AdvancedSeries();
        harryPotter4.seriesId = 2;
        harryPotter4.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        harryPotter4.title = "Harry potter and the goblet of fire";
        moviesList.add(harryPotter4);

        AdvancedSeries harryPotter5 = new AdvancedSeries();
        harryPotter5.seriesId = 2;
        harryPotter5.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
        harryPotter5.title = "Harry potter and the order of the phoenix ";
        moviesList.add(harryPotter5);

        AdvancedSeries harryPotter6 = new AdvancedSeries();
        harryPotter6.seriesId = 2;
        harryPotter6.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg ";
        harryPotter6.title = "Harry potter and the half-blood prince";
        moviesList.add(harryPotter6);

        AdvancedSeries harryPotter7Part1 = new AdvancedSeries();
        harryPotter7Part1.seriesId = 2;
        harryPotter7Part1.imageUrl = "https://images.moviesanywhere.com/de6092b467fc299fdf79a51dfa7f9710/12b877a3-28de-46ff-820f-dd8bf07e8edb.jpg";
        harryPotter7Part1.title = "Harry potter and the deathly hallows: part 1";
        moviesList.add(harryPotter7Part1);

        AdvancedSeries harryPotter7Part2 = new AdvancedSeries();
        harryPotter7Part2.seriesId = 2;
        harryPotter7Part2.imageUrl = "https://images.moviesanywhere.com/5f0537520f90b687fc5db7f241affc4c/0280fd81-6b8a-49cc-9b81-5154eee498dc.jpg";
        harryPotter7Part2.title = "Harry potter and the deathly hallows: part 2";
        moviesList.add(harryPotter7Part2);
    }

    public void setupSeriesRecyclerView() {
        seriesRv = findViewById(R.id.series_rv);
        seriesRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        advancedSeriesAdapter = new AdvancedSeriesAdapter();
        advancedSeriesAdapter.setData(moviesList);
        seriesRv.setAdapter(advancedSeriesAdapter);
    }
}