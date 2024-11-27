package com.example.franco_reciclerscrollbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_scrollView, btn_reciclerCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn_scrollView = findViewById(R.id.btn_scrollv);
        btn_scrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this, Scroll.class);
                startActivity(i);
            }
        });

        btn_reciclerCard = findViewById(R.id.btn_reciclerCard);
        btn_reciclerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recicler = new Intent(MainActivity.this, ReciclerView.class);
                startActivity(recicler);
            }
        });
    }
}