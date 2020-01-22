package com.example.mltoolkitfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PlaceOrder extends AppCompatActivity {
private Button book ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
        book = (Button)findViewById(R.id.booked);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PlaceOrder.this, "ThankYou for Booking", Toast.LENGTH_LONG).show();
            }
        });
    }
}
