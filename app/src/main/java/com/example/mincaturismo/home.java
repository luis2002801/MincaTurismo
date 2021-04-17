package com.example.mincaturismo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class home extends AppCompatActivity {

    ArrayList<PaqueteMinca> listaDeDatos=new ArrayList<>();
    RecyclerView listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listado=findViewById(R.id.listado);
        listado.setHasFixedSize(true);
        listado.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearListado();

        AdaptadorLista adaptador = new AdaptadorLista(listaDeDatos);
        listado.setAdapter(adaptador);
    }

    private void crearListado() {

        listaDeDatos.add(new PaqueteMinca (
                "Pozo Del Cielo",
                getString(R.string.descripcion),
                R.drawable.natural
        ));

        listaDeDatos.add(new PaqueteMinca(
                "Hotel Madera",
                getString(R.string.descripcionHotel),
                R.drawable.hoteles
        ));

        listaDeDatos.add(new PaqueteMinca(
                "Plato Regional",
                getString(R.string.descripcionComida),
                R.drawable.comida
        ));


    }
}