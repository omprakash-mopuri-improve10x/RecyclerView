package com.example.filmdairy.message;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.filmdairy.R;
import com.example.filmdairy.message.Message;
import com.example.filmdairy.message.MessageAdapter;

import java.util.ArrayList;

public class MessagesActivity extends AppCompatActivity {

    public RecyclerView messagesRv;
    public ArrayList<Message> messagesList;
    public MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        getSupportActionBar().setTitle("Messages");
        setupData();
        setupMessagesRecyclerView();
    }

    public void setupData() {
        messagesList = new ArrayList<>();

        Message aravind = new Message();
        aravind.messageId = 1;
        aravind.name = "Aravind";
        aravind.phoneNumber = "+91 9000540052";
        aravind.messageText = "Hi, Welcome to Improve 10X.";
        messagesList.add(aravind);

        Message ramesh = new Message();
        ramesh.messageId = 2;
        ramesh.name = "Ramesh";
        ramesh.phoneNumber = "+91 9999999999";
        ramesh.messageText = "Hi, Welcome to Improve 10X.";
        messagesList.add(ramesh);

        Message empty = new Message();
        empty.messageId = 3;
        empty.name = "";
        empty.phoneNumber = "+91 9999999991";
        empty.messageText = "Hi, call me when you see the message";
        messagesList.add(empty);

        Message kailash = new Message();
        kailash.messageId = 4;
        kailash.name = "Kailash";
        kailash.phoneNumber = "+91 9999999992";
        kailash.messageText = "-";
        messagesList.add(kailash);

        Message swiggy = new Message();
        swiggy.messageId = 5;
        swiggy.name = "Swiggy Delivery";
        swiggy.phoneNumber = "+91 9999999993";
        swiggy.messageText = "full address";
        messagesList.add(swiggy);

        Message swiggyDelivery = new Message();
        swiggyDelivery.messageId = 5;
        swiggyDelivery.name = "Swiggy Delivery";
        swiggyDelivery.phoneNumber = "+91 9999999993";
        swiggyDelivery.messageText = "Are you available for this sunday?\n    \nWe can have a call and discuss the movie";
        messagesList.add(swiggyDelivery);
    }

    public void setupMessagesRecyclerView() {
        messagesRv = findViewById(R.id.messages_rv);
        messagesRv.setLayoutManager(new LinearLayoutManager(this));
        messageAdapter = new MessageAdapter();
        messageAdapter.setData(messagesList);
        messagesRv.setAdapter(messageAdapter);
    }
}