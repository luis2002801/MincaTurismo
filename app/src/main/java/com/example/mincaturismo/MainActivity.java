package com.example.mincaturismo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nombreTuristico,descripcion;
    ImageView fotoSitio;

    PaqueteMinca turismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreTuristico=findViewById(R.id.nombreTuristico);
        descripcion=findViewById(R.id.descripcion);
        fotoSitio=findViewById(R.id.fotoSitio);

        turismo=(PaqueteMinca) getIntent().getSerializableExtra("PaqueteMinca");

        nombreTuristico.setText(turismo.getNombreTuristico());
        descripcion.setText(turismo.getDescripcion());
        fotoSitio.setImageResource(turismo.getFotoSitio());
    }
}