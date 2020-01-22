package com.example.mltoolkitfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Availability extends AppCompatActivity {
    private Button chkst;
    private Button prost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availability);

        chkst = (Button)findViewById(R.id.status);
        prost = (Button)findViewById(R.id.prostatus);
        chkst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Availability.this, StatusCheck.class);
                startActivity(intent);
            }
        });



        prost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Availability.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
