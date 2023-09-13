package com.example.conociendobetania.adaptadores;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.conociendobetania.Ampliandohotel;
import com.example.conociendobetania.R;
import com.example.conociendobetania.moldes.MoldeHotel;

import java.util.ArrayList;

public class AdaptadorHotel extends  RecyclerView.Adapter<AdaptadorHotel.viewHolder>{

    public ArrayList<MoldeHotel> listaHoteles;

    public AdaptadorHotel() {
    }

    @NonNull
    @Override
    public AdaptadorHotel.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHotel.viewHolder holder, int position) {
    holder.actualizarDatos(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public AdaptadorHotel(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView contactoHotel;
        RatingBar valoracionHotel;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotolistahotel);
            nombreHotel=itemView.findViewById(R.id.nombrelistahotel);
            contactoHotel=itemView.findViewById(R.id.numerolistahotel);
            valoracionHotel=itemView.findViewById(R.id.valoracionMoldeHotel);
        
        }

        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            contactoHotel.setText(moldeHotel.getContacto());
            valoracionHotel.setRating(moldeHotel.getValoracion());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), Ampliandohotel.class);
                    intent.putExtra("datoshotel",moldeHotel);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
