package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.conociendobetania.adaptadores.AdaptadorHotel;
import com.example.conociendobetania.moldes.MoldeHotel;
import com.example.conociendobetania.moldes.MoldeSitios;

import java.util.ArrayList;

public class Listaturismo extends AppCompatActivity {

    ArrayList<MoldeSitios> listasitios = new ArrayList<>();

    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView = findViewById((R.id.reciclerviewhotel));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarlistacondatos();
        //AdaptadorHotel adaptadorHotel = new AdaptadorHotel(listasitios);
        //recyclerView.setAdapter(adaptadorHotel);

    }

    public void llenarlistacondatos () {
       // listasitios.add(new MoldeHotel("Altomachupichu", "Andres soto", "3242310182", R.drawable.restaurantee));

    }

}