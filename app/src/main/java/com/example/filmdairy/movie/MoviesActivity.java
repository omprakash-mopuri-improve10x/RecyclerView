package com.example.filmdairy.movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.filmdairy.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoviesActivity extends AppCompatActivity {

    public RecyclerView moviesRv;
    public ArrayList<Movie> moviesList = new ArrayList<>();
    public MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        getSupportActionBar().setTitle("Movies");
        setupMoviesRecyclerView();
        fetchMovies();
    }

    public void fetchMovies() {
        MovieApi movieApi = new MovieApi();
        MovieService movieService = movieApi.createMovieService();
        Call<List<Movie>> call = movieService.fetchMovies();
        call.enqueue(new Callback<List<Movie>>() {
            @Override
            public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
                List<Movie> movies = response.body();
                movieAdapter.setData(movies);
            }

            @Override
            public void onFailure(Call<List<Movie>> call, Throwable t) {
                Toast.makeText(MoviesActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setupMoviesRecyclerView() {
        moviesRv = findViewById(R.id.movies_rv);
        moviesRv.setLayoutManager(new GridLayoutManager(this, 2));
        movieAdapter = new MovieAdapter();
        movieAdapter.setData(moviesList);
        moviesRv.setAdapter(movieAdapter);
    }
}