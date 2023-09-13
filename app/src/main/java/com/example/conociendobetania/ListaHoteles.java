package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.conociendobetania.adaptadores.AdaptadorHotel;
import com.example.conociendobetania.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {
ArrayList<MoldeHotel> listahoteles = new ArrayList<>();

RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView = findViewById((R.id.reciclerviewhotel));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarlistacondatos();
        AdaptadorHotel adaptadorHotel = new AdaptadorHotel(listahoteles);
        recyclerView.setAdapter(adaptadorHotel);

    }

    public void llenarlistacondatos () {
        listahoteles.add(new MoldeHotel("manantiales", "3242310182", R.drawable.hotel, 3.7f));
        listahoteles.add(new MoldeHotel("El encanto",  "3242310182", R.drawable.hotell,2.5f));
        listahoteles.add(new MoldeHotel("Eco brisas", "3242310182", R.drawable.hotelll, 3.5f));
        listahoteles.add(new MoldeHotel("Huiata", "3242310182", R.drawable.hotellll,1.8f));
        listahoteles.add(new MoldeHotel("Betania",  "3242310182", R.drawable.hotelllll,2.6f));
    }

}