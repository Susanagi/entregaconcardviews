package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.conociendobetania.moldes.MoldeHotel;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeHotel moldeRestaurante;

    ImageView fotoAmpliandoRestaurante;
    TextView nombreAmpliandoRestaurante;
    TextView telefonoAmpliandoRestaurante;
    RatingBar valoracionRestauranteAmpliando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        fotoAmpliandoRestaurante = findViewById(R.id.fotoAmpliandoRestaurante);
        nombreAmpliandoRestaurante = findViewById(R.id.tituloAmpliandoRestaurante);
        telefonoAmpliandoRestaurante = findViewById(R.id.telefonoAmpliandoRestaurante);
        valoracionRestauranteAmpliando = findViewById(R.id.valoracionAmpliandoHotel);

        moldeRestaurante = (MoldeHotel)getIntent().getSerializableExtra("datosresta");

        fotoAmpliandoRestaurante.setImageResource(moldeRestaurante.getFoto());
        nombreAmpliandoRestaurante.setText(moldeRestaurante.getNombre());
        telefonoAmpliandoRestaurante.setText(moldeRestaurante.getContacto());
        valoracionRestauranteAmpliando.setRating(moldeRestaurante.getValoracion());
    }


}
