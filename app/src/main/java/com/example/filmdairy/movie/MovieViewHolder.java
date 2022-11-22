package com.example.filmdairy.movie;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmdairy.R;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageImg;
    public TextView titleTxt;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        imageImg = itemView.findViewById(R.id.image_img);
        titleTxt = itemView.findViewById(R.id.title_txt);
    }
}
