package com.example.usuario.rellayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText ETpeso;
    EditText ETdolar;
    TextView TVResultado;
    RadioButton RBPesoDolar,RBDolarPeso;
    double resultado;
    double valorPeso_en_Dolar=0.0492472;
    double valorDolar_en_Peso=20.3097;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETpeso=findViewById(R.id.campoPeso);
        ETdolar=findViewById(R.id.campoDolar);
        RBPesoDolar=findViewById(R.id.convertirPesoDolar);
        RBDolarPeso=findViewById(R.id.convertirDolarPeso);

        TVResultado=findViewById(R.id.res);

    }

    public void onclickButton(View view) {
        if (view.getId()==R.id.btn) {
            if (RBPesoDolar.isChecked())
            {
                convertirPeso_a_Dolar(Double.parseDouble(ETpeso.getText().toString()));
            }
            if (RBDolarPeso.isChecked())
            {
                convertirDolar_a_Peso(Double.parseDouble(ETdolar.getText().toString()));
            }
        }

    }

    public void convertirPeso_a_Dolar(double MXN)
    {
        resultado=MXN*valorPeso_en_Dolar;
        TVResultado.setText(String.format("%.2f",resultado)+" USD");

    }
    public void convertirDolar_a_Peso(double USD)
    {
        resultado=USD*valorDolar_en_Peso;
        TVResultado.setText(String.format("%.4f",resultado)+" MXN");

    }
}
