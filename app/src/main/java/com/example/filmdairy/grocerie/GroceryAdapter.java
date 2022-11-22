package com.example.filmdairy.grocerie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmdairy.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryViewHolder> {

    public ArrayList<Grocery> groceries;

    public void setData(ArrayList<Grocery> groceriesList) {
        groceries = groceriesList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grocery_item, parent, false);
        GroceryViewHolder groceryViewHolder = new GroceryViewHolder(view);
        return groceryViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        Grocery grocery = groceries.get(position);
        Picasso.get().load(grocery.imageUrl).into(holder.imageImg);
        holder.titleTxt.setText(grocery.title);
    }

    @Override
    public int getItemCount() {
        return groceries.size();
    }
}
