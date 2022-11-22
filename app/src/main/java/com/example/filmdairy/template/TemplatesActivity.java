package com.example.filmdairy.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.filmdairy.R;

import java.util.ArrayList;

public class TemplatesActivity extends AppCompatActivity {

    public ArrayList<Template> templatesList;
    public RecyclerView templatesRv;
    public TemplateAdapter templateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates);
        getSupportActionBar().setTitle("Templates");
        setupData();
        setupTemplatesRecyclerView();
    }

    public void setupData() {
        templatesList = new ArrayList<>();

        Template welcomeMessage = new Template();
        welcomeMessage.templateId = 1;
        welcomeMessage.messageText = "Hi,\nWelcome to Improve 10X.";
        templatesList.add(welcomeMessage);

        Template busyMessage = new Template();
        busyMessage.templateId = 2;
        busyMessage.messageText = "Hi, I'm busy. I'll call you later";
        templatesList.add(busyMessage);

        Template callMessage = new Template();
        callMessage.templateId = 3;
        callMessage.messageText = "Hi,\ncall me when you see the message";
        templatesList.add(callMessage);

        Template contactDetailsMessage = new Template();
        contactDetailsMessage.templateId = 4;
        contactDetailsMessage.messageText = "-Hi, Please find my contact details\nName : Viswanath Kumar Sandu\ncompany : Improve 10X\nMobile : +919000540052";
        templatesList.add(contactDetailsMessage);

        Template accountDetailsMessage = new Template();
        accountDetailsMessage.templateId = 5;
        accountDetailsMessage.messageText = "Hi, Please find my account details\nAccount Number : 625101515776\nBank : ICICI Bank\nIFSC : ICIC0006251";
        templatesList.add(accountDetailsMessage);
    }

    public void setupTemplatesRecyclerView() {
        templatesRv = findViewById(R.id.templates_rv);
        templatesRv.setLayoutManager(new LinearLayoutManager(this));
        templateAdapter = new TemplateAdapter();
        templateAdapter.setData(templatesList);
        templatesRv.setAdapter(templateAdapter);
    }
}