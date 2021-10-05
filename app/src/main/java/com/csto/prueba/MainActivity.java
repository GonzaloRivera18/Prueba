package com.csto.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText User,Pass;
    Button conect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User = (EditText) findViewById(R.id.txt_user);
        Pass = (EditText) findViewById(R.id.txt_pass);
        conect = (Button) findViewById(R.id.button);

        conect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Usuario = User.getText().toString();
                String Contra = Pass.getText().toString();
                if (Usuario.equals("adm")&&(Contra.equals("123")))
                {
                    Intent I = new Intent(getApplicationContext(),ControlCenso.class);
                    startActivity(I);
                }else
                {
                    Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecta, vuelva a intentarlo.",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}