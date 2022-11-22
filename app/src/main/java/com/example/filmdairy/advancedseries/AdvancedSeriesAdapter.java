package com.example.filmdairy.advancedseries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmdairy.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdvancedSeriesAdapter extends RecyclerView.Adapter<AdvancedSeriesViewHolder> {

    public ArrayList<AdvancedSeries> series;

    public void setData(ArrayList<AdvancedSeries> seriesList) {
        series = seriesList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdvancedSeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advanced_series_item, parent, false);
        AdvancedSeriesViewHolder advancedSeriesViewHolder = new AdvancedSeriesViewHolder(view);
        return advancedSeriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdvancedSeriesViewHolder holder, int position) {
        AdvancedSeries advancedSeries = series.get(position);
        Picasso.get().load(advancedSeries.imageUrl).into(holder.imageImg);
        holder.titleTxt.setText(advancedSeries.title);
    }

    @Override
    public int getItemCount() {
        return series.size();
    }
}
