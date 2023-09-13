package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.conociendobetania.adaptadores.AdaptadorHotel;
import com.example.conociendobetania.adaptadores.AdaptadorRestaurante;
import com.example.conociendobetania.moldes.MoldeHotel;
import com.example.conociendobetania.moldes.Molderestaurante;

import java.util.ArrayList;

public class Listarestaurante extends AppCompatActivity {
    ArrayList<Molderestaurante> listarestaurante = new ArrayList<>();

    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView = findViewById((R.id.reciclerviewhotel));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        llenarlistacondatos();
        AdaptadorRestaurante adaptadorRestaurante = new AdaptadorRestaurante(listarestaurante);
        recyclerView.setAdapter(adaptadorRestaurante);

    }

    public void llenarlistacondatos() {
        listarestaurante.add(new Molderestaurante("Betania food", R.drawable.restaurante, "3242310182","25.000 hasta 60.000","Pescado"));
        listarestaurante.add(new Molderestaurante("El rincon del pueblo", R.drawable.restaurantee, "3242310182","15.000 hasta 35.000\"","Menu del dia"));
        listarestaurante.add(new Molderestaurante("Betania food", R.drawable.rrresta,"3242310182","25.000 hasta 40.000","Comida tipica"));
        listarestaurante.add(new Molderestaurante("Betania food", R.drawable.rresta, "3242310182","35.000 hasta 55.000","Comida de mar"));
        listarestaurante.add(new Molderestaurante("Betania food", R.drawable.restau, "3242310182","25.000 hasta 60.000","Comida criolla"));




    }

}