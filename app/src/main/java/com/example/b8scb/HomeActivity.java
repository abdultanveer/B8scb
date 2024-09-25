package com.example.b8scb;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
int product = 20;

TextView homeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homeView = findViewById(R.id.tvHome);
        //get intent which started this activity
        //retreive extras fromm that inntent
        //get the string with the key myname
       String name = getIntent().getExtras().getString("myname");
       homeView.setText(name);
        //set it onnto a textview

    }
}