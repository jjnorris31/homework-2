package com.example.aboutmyself;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMain(View view) {
        Intent mainIntent = new Intent(this, MenuActivity.class);
        EditText username = (EditText) findViewById(R.id.editText);
        mainIntent.putExtra("username", username.getText().toString());
        startActivity(mainIntent);
    }
}
