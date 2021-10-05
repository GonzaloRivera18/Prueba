package com.csto.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ControlCenso extends AppCompatActivity {

    TextView Total,Hom,Muj;
    ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_censo);
        imgbtn =(ImageButton) findViewById(R.id.Imgbutton);
        Total = (TextView) findViewById(R.id.txt_total);
        Hom = (TextView) findViewById(R.id.txt_homb);
        Muj = (TextView) findViewById(R.id.txt_muj);

        Bundle B =getIntent().getExtras();
        String NOMBRE = B.getString("Nombre");
        String EDAD = B.getString("Edad");
        String GENERO = B.getString("Genero");
        Integer TOTAL = B.getInt("Total");
        Integer CONTADORH = B.getInt("ContadorH");
        Integer CONTADORM = B.getInt("ContadorM");

        Hom.setText(""+CONTADORH);
        Muj.setText(""+CONTADORM);
        Total.setText(""+TOTAL);


        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),Agregar.class);
                startActivity(I);
            }
        });
    }
}