package com.csto.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.controls.Control;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Agregar extends AppCompatActivity {

    String NOM,ED,GEN;

    EditText Nombre,Edad;
    Spinner Genero;
    Button btn_ag;
    Integer contadorH=0,contadorM=0,Total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        Nombre = (EditText) findViewById(R.id.txt_nom);
        Edad = (EditText) findViewById(R.id.txt_ed);
        Genero = (Spinner) findViewById(R.id.spn_gen);
        btn_ag = (Button) findViewById(R.id.btn_add);

        btn_ag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nom = Nombre.getText().toString();
                String Ed = Edad.getText().toString();
                String Gen = Genero.getSelectedItem().toString();
                if (Nom!=""&&Ed!=""&&Gen=="Hombre")
                {
                    contadorH++;
                    Total++;
                }else if (Nom!=""&&Ed!=""&&Gen=="Mujer")
                {
                    contadorM++;
                    Total++;
                }else if (Nom==""&&Ed=="")
                {
                    Toast.makeText(getApplicationContext(),"Rellene todos los campos",Toast.LENGTH_LONG).show();
                }
                Intent I = new Intent(getApplicationContext(),ControlCenso.class);
                I.putExtra("Nombre",NOM);
                I.putExtra("Edad",ED);
                I.putExtra("Genero",GEN);
                I.putExtra("ContadorH",contadorH);
                I.putExtra("ContadorM",contadorM);
                I.putExtra("Total",Total);
            }
        });
    }
}