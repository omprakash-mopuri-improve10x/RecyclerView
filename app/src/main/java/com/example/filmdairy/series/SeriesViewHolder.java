package com.example.filmdairy.series;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmdairy.R;

public class SeriesViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageImg;
    public TextView titleTxt;

    public SeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        imageImg = itemView.findViewById(R.id.image_img);
        titleTxt = itemView.findViewById(R.id.title_img);
    }
}
