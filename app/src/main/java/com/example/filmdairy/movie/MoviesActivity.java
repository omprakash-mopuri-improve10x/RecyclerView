package com.example.filmdairy.movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.filmdairy.R;

import java.util.ArrayList;

public class MoviesActivity extends AppCompatActivity {

    public RecyclerView moviesRv;
    public ArrayList<Movie> moviesList;
    public MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        getSupportActionBar().setTitle("Movies");
        setupData();
        setupMoviesRecyclerView();
    }

    public void setupData() {
        moviesList = new ArrayList<>();

         Movie harryPotter1 = new Movie();
         harryPotter1.seriesId = 2;
         harryPotter1.movieId = 1;
         harryPotter1.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220 ";
         harryPotter1.title = "Harry potter and the sorcerer's Stone";
         moviesList.add(harryPotter1);

         Movie harryPotter2 = new Movie();
         harryPotter2.seriesId = 2;
         harryPotter2.movieId = 2;
         harryPotter2.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
         harryPotter2.title = "Harry potter and the chamber of secrets";
         moviesList.add(harryPotter2);

         Movie harryPotter3 = new Movie();
         harryPotter3.seriesId = 2;
         harryPotter3.movieId = 3;
         harryPotter3.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";
         harryPotter3.title = "Harry potter and the prisoner of azkaban";
         moviesList.add(harryPotter3);

         Movie harryPotter4 = new Movie();
         harryPotter4.seriesId = 2;
         harryPotter4.movieId = 4;
         harryPotter4.imageUrl = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
         harryPotter4.title = "Harry potter and the goblet of fire";
         moviesList.add(harryPotter4);

         Movie harryPotter5 = new Movie();
         harryPotter5.seriesId = 2;
         harryPotter5.movieId = 5;
         harryPotter5.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
         harryPotter5.title = "Harry potter and the order of the phoenix ";
         moviesList.add(harryPotter5);

         Movie harryPotter6 = new Movie();
         harryPotter6.seriesId = 2;
         harryPotter6.movieId = 6;
         harryPotter6.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg ";
         harryPotter6.title = "Harry potter and the half-blood prince";
         moviesList.add(harryPotter6);

        Movie harryPotter7Part1 = new Movie();
        harryPotter7Part1.seriesId = 2;
        harryPotter7Part1.movieId = 7;
        harryPotter7Part1.imageUrl = "https://images.moviesanywhere.com/de6092b467fc299fdf79a51dfa7f9710/12b877a3-28de-46ff-820f-dd8bf07e8edb.jpg";
        harryPotter7Part1.title = "Harry potter and the deathly hallows: part 1";
        moviesList.add(harryPotter7Part1);

        Movie harryPotter7Part2 = new Movie();
        harryPotter7Part2.seriesId = 2;
        harryPotter7Part2.movieId = 8;
        harryPotter7Part2.imageUrl = "https://images.moviesanywhere.com/5f0537520f90b687fc5db7f241affc4c/0280fd81-6b8a-49cc-9b81-5154eee498dc.jpg";
        harryPotter7Part2.title = "Harry potter and the deathly hallows: part 2";
        moviesList.add(harryPotter7Part2);
    }

    public void setupMoviesRecyclerView() {
        moviesRv = findViewById(R.id.movies_rv);
        moviesRv.setLayoutManager(new GridLayoutManager(this, 2));
        movieAdapter = new MovieAdapter();
        movieAdapter.setData(moviesList);
        moviesRv.setAdapter(movieAdapter);
    }
}