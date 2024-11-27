package com.example.franco_reciclerscrollbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Scroll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scroll);



    }

    public void seleccionar(View view){
        String cadena = getResources().getResourceEntryName(view.getId());
        Toast.makeText(this, "Esta imágen representa: "+cadena, Toast.LENGTH_SHORT).show();
    }
}