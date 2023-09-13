package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restaurante extends AppCompatActivity {
    Button vermas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        vermas = findViewById(R.id.botonrestaurantes);
        vermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listarestaurante = new Intent(Restaurante.this,Listarestaurante.class);
                startActivity(listarestaurante);
            }
        });
    }
}