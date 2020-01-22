package com.example.mltoolkitfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MidActivity extends AppCompatActivity {
    private Button menu1;
    private Button avail1;
    private Button placeor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid);

        menu1 = (Button)findViewById(R.id.menu);
        avail1 = (Button)findViewById(R.id.avail);
        placeor1 = (Button)findViewById(R.id.placeor);
         menu1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MidActivity.this, Menu2.class);
                 startActivity(intent);
             }
         });



        avail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MidActivity.this, Availability.class);
                startActivity(intent);
            }
        });


        placeor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MidActivity.this, PlaceOrder.class);
                startActivity(intent);
            }
        });










    }
}

