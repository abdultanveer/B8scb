package com.example.b8scb;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
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

    public void setAlarm(View view) {
        createAlarm("b9scb",13,52);
    }

    public void createAlarm(String message, int hour, int minutes) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
       // if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

    }
}