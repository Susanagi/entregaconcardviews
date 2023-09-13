package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.conociendobetania.moldes.MoldeHotel;

public class Ampliandohotel extends AppCompatActivity {

    MoldeHotel moldeHotel;

    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView telefonoHotelAmpliando;
    RatingBar valoracionHotelAmpliando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliandohotel);

        fotoAmpliandoHotel = findViewById(R.id.fotoAmpliandoHotel);
        nombreAmpliandoHotel = findViewById(R.id.tituloAmpliandoHotel);
        telefonoHotelAmpliando = findViewById(R.id.telefonoAmpliandoHotel);
        valoracionHotelAmpliando = findViewById(R.id.valoracionAmpliandoHotel);

        moldeHotel = (MoldeHotel)getIntent().getSerializableExtra("datoshotel");

        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        telefonoHotelAmpliando.setText(moldeHotel.getContacto());
        valoracionHotelAmpliando.setRating(moldeHotel.getValoracion());
    }


}