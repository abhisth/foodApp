package com.example.food_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GSactivity extends AppCompatActivity {

    Button getstartedbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsactivity);

        getstartedbtn = findViewById(R.id.getstartedbtn);

        getstartedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GSactivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}