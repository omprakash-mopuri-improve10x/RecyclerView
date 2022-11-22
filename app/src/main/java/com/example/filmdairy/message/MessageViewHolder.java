package com.example.filmdairy.message;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmdairy.R;

public class MessageViewHolder extends RecyclerView.ViewHolder {

   public TextView nameTxt;
   public TextView phoneNumberTxt;
   public TextView messageTextTxt;

    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTxt = itemView.findViewById(R.id.name_txt);
        phoneNumberTxt = itemView.findViewById(R.id.phone_number_txt);
        messageTextTxt = itemView.findViewById(R.id.message_text_txt);
    }
}
