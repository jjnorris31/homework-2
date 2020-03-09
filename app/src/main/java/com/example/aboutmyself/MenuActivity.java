package com.example.aboutmyself;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MenuActivity extends Activity {

    public static final String USERNAME = "username";
    public ConstraintLayout mainLayout;
    public ConstraintLayout hobbyLayout;
    public ConstraintLayout messageLayout;
    public ConstraintLayout friendsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mainLayout = findViewById(R.id.mainLayout);
        hobbyLayout = findViewById(R.id.hobbyLayout);
        messageLayout = findViewById(R.id.messageLayout);
        friendsLayout = findViewById(R.id.friendsLayout);
        hobbyLayout.setVisibility(View.GONE);
        messageLayout.setVisibility(View.GONE);
        friendsLayout.setVisibility(View.GONE);

        Intent intent = getIntent();
        String username = intent.getStringExtra(USERNAME);
        TextView userView = findViewById(R.id.username);
        String hiText = "Hi there " + username;
        userView.setText(hiText);
    }

    public void hobbySelected(View view) {
        mainLayout.setVisibility(View.GONE);
        hobbyLayout.setVisibility(View.VISIBLE);

    }

    public void messageSelected(View view) {
        mainLayout.setVisibility(View.GONE);
        messageLayout.setVisibility(View.VISIBLE);

    }

    public void friendsSelected(View view) {
        mainLayout.setVisibility(View.GONE);
        friendsLayout.setVisibility(View.VISIBLE);
    }

    public void sendHobby(View view) {
        EditText hobbyTV = findViewById(R.id.userHobby);
        TextView imageText = findViewById(R.id.imageText);
        String hobbyText = "My hobby is " +  hobbyTV.getText().toString();
        imageText.setText(hobbyText);
        mainLayout.setVisibility(View.VISIBLE);
        hobbyLayout.setVisibility(View.GONE);
    }

    public void sendMessage(View view) {
        Toast messageToast = Toast.makeText(getApplicationContext(), "Message sent", Toast.LENGTH_SHORT);
        messageToast.show();
        mainLayout.setVisibility(View.VISIBLE);
        messageLayout.setVisibility(View.GONE);
    }

    public void backToMain(View view) {
        mainLayout.setVisibility(View.VISIBLE);
        friendsLayout.setVisibility(View.GONE);
    }



}
