package com.example.conociendobetania.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.conociendobetania.AmpliandoRestaurante;
import com.example.conociendobetania.Ampliandohotel;
import com.example.conociendobetania.R;
import com.example.conociendobetania.moldes.Molderestaurante;

import java.util.ArrayList;

public class AdaptadorRestaurante extends  RecyclerView.Adapter<AdaptadorRestaurante.viewHolder> {

    public ArrayList<Molderestaurante> listaRestaurantes;
    public AdaptadorRestaurante() {
    }

    public AdaptadorRestaurante(ArrayList<Molderestaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurante.viewHolder holder, int position) {
    holder.actualizarDatos(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotolistarestaurante;
        TextView contactorestaurante;
        TextView preciorestaurante;
        TextView platorecomendadorestaurante;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotolistarestaurante=itemView.findViewById(R.id.fotolistarestaurante);
            contactorestaurante=itemView.findViewById(R.id.Contactolistarestaurante);
            preciorestaurante=itemView.findViewById(R.id.preciolistarestaurante);
            platorecomendadorestaurante=itemView.findViewById(R.id.platorecomendadolistarestaurante);


        }

        public void actualizarDatos(Molderestaurante molderestaurante) {
            fotolistarestaurante.setImageResource(molderestaurante.getFoto());
            contactorestaurante.setText(molderestaurante.getTelefono());
            preciorestaurante.setText(molderestaurante.getRangoprecio());
            platorecomendadorestaurante.setText(molderestaurante.getPlatorecomendado());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoRestaurante.class);
                    intent.putExtra("datosresta",molderestaurante);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
