package com.example.filmdairy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.filmdairy.advancedseries.AdvancedSeriesActivity;
import com.example.filmdairy.grocerie.GroceriesListActivity;
import com.example.filmdairy.message.MessagesActivity;
import com.example.filmdairy.movie.MoviesActivity;
import com.example.filmdairy.series.SeriesActivity;
import com.example.filmdairy.template.TemplatesActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        handleTemplateButton();
        handleMessagesButton();
        handleSeriesButton();
        handleMoviesButton();
        handleAdvancedSeriesButton();
        handleGroceryListButton();
    }

    public void handleTemplateButton() {
        Button templateBtn = findViewById(R.id.template_btn);
        templateBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TemplatesActivity.class);
            startActivity(intent);
        });
    }

    public void handleMessagesButton() {
        Button messagesBtn = findViewById(R.id.messages_btn);
        messagesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MessagesActivity.class);
            startActivity(intent);
        });
    }

    public void handleSeriesButton() {
        Button seriesBtn = findViewById(R.id.series_btn);
        seriesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SeriesActivity.class);
            startActivity(intent);
        });
    }

    public void handleMoviesButton() {
        Button moviesBtn = findViewById(R.id.movies_btn);
        moviesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MoviesActivity.class);
            startActivity(intent);
        });
    }

    public void handleAdvancedSeriesButton() {
        Button advancedSeriesButton = findViewById(R.id.advanced_series_btn);
        advancedSeriesButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, AdvancedSeriesActivity.class);
            startActivity(intent);
        });
    }

    public void handleGroceryListButton() {
        Button groceriesListBtn = findViewById(R.id.groceries_list_btn);
        groceriesListBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, GroceriesListActivity.class);
            startActivity(intent);
        });
    }
}