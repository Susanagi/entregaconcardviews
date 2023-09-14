package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.conociendobetania.adaptadores.AdaptadorHotel;
import com.example.conociendobetania.moldes.MoldeHotel;
import com.example.conociendobetania.moldes.MoldeSitios;
import com.example.conociendobetania.moldes.Molderestaurante;

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
        listaturismo.add(new Moldeturismo("Alto machupichu","Pedro","3242310182", R.drawable.restaurante));
        listaturismo.add(new Moldeturismo("El rincon del pueblo", R.drawable.restaurantee, "3242310182","15.000 hasta 35.000\"","Menu del dia"));
        listarestaurante.add(new Molderestaurante("Betania food", R.drawable.rrresta,"3242310182","25.000 hasta 40.000","Comida tipica"));
        listarestaurante.add(new Molderestaurante("Betania food", R.drawable.rresta, "3242310182","35.000 hasta 55.000","Comida de mar"));
        listarestaurante.add(new Molderestaurante("Betania food", R.drawable.restau, "3242310182","25.000 hasta 60.000","Comida criolla"));

    }

}