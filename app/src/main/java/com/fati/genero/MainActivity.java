package com.fati.genero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaración de objetos
    RadioButton rbtnF, rbtnM;
    Button btnE, btnS;
    TextView txtResul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbtnF = findViewById(R.id.radioButtonFemenino);
        rbtnM = findViewById(R.id.radioButtonMasculino);

        btnE = findViewById(R.id.buttonEjecutar);
        btnS = findViewById(R.id.buttonSalir);

        txtResul = findViewById(R.id.txtResultado);

        btnE.setOnClickListener(V->{

            if (rbtnF.isChecked()){

                String fem = rbtnF.getText().toString();
                txtResul.setText(fem);

            }

            if (rbtnM.isChecked()){

                String mas = rbtnM.getText().toString();
                txtResul.setText(mas);

            }


        });

        btnS.setOnClickListener(V->finish());

    }
}