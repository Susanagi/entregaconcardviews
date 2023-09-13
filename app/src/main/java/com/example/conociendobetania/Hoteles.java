package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hoteles extends AppCompatActivity {
    Button vermas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);
        vermas = findViewById(R.id.botonhoteles);
        vermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listahotel = new Intent(Hoteles.this,ListaHoteles.class);
                startActivity(listahotel);
            }
        });
    }
}