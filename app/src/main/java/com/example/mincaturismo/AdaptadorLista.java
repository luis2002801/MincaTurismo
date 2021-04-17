package com.example.mincaturismo;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.viewHolder>{

    ArrayList<PaqueteMinca> listaDeDatos;

    public AdaptadorLista(ArrayList<PaqueteMinca> listaDeDatos) {
        this.listaDeDatos = listaDeDatos;
    }

    @NonNull
    @Override
    public AdaptadorLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View vistaItemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista,parent,false);
        return  new viewHolder(vistaItemLista);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.viewHolder holder, int position){
        holder.actualizarDatosDeItem(listaDeDatos.get(position));
    }

    @Override
    public int getItemCount(){
        return listaDeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView nombreTuristico,descripcion;
        ImageView fotoSitio;

        public viewHolder(@NonNull View itemView){
            super(itemView);
            nombreTuristico=itemView.findViewById(R.id.nombreTuristico);
            descripcion=itemView.findViewById(R.id.descripcion);
            fotoSitio=itemView.findViewById(R.id.fotoSitio);
        }

        public void actualizarDatosDeItem(final PaqueteMinca turismo) {
            nombreTuristico.setText(turismo.getNombreTuristico());
            descripcion.setText(turismo.getDescripcion());
            fotoSitio.setImageResource(turismo.getFotoSitio());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent= new Intent(itemView.getContext(),MainActivity.class);
                    intent.putExtra("PaqueteMinca",turismo);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }


}
