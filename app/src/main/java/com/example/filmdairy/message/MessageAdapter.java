package com.example.filmdairy.message;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filmdairy.R;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {

    public ArrayList<Message> messages;

    public void setData(ArrayList<Message> messagesList) {
        messages = messagesList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_item, parent, false);
        MessageViewHolder messageViewHolder = new MessageViewHolder(view);
        return messageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        Message message = messages.get(position);
        holder.nameTxt.setText(message.name);
        holder.phoneNumberTxt.setText(message.phoneNumber);
        holder.messageTextTxt.setText(message.messageText);
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
