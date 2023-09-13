package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.conociendobetania.moldes.MoldeHotel;

public class Ampliandositios extends AppCompatActivity {

    MoldeHotel moldeSitios;

    ImageView fotoAmpliandoSitios;
    TextView nombreAmpliandoSitios;
    TextView telefonoAmpliandoSitios;
    RatingBar valoracionAmpliandoSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);

        fotoAmpliandoSitios = findViewById(R.id.fotolistamachupichusitios);
        nombreAmpliandoSitios = findViewById(R.id.);
        telefonoAmpliandoSitios = findViewById(R.id.telefonoAmpliandoSitios);
        valoracionAmpliandoSitios = findViewById(R.id.valo);

        moldeSitios = (MoldeHotel)getIntent().getSerializableExtra("datosSitios");

        fotoAmpliandoSitios.setImageResource(moldeSitios.getFoto());
        nombreAmpliandoSitios.setText(moldeSitios.getNombre());
        telefonoAmpliandoSitios.setText(moldeSitios.getContacto());
        valoracionAmpliandoSitios.setRating(moldeSitios.getValoracion());
    }


}