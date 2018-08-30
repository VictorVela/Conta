package com.example.victo.conta.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText comanda;
    private EditText pessoas;
    private TextView resultado;
    private CheckBox porcento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comanda   = findViewById(R.id.comanda);
        pessoas   = findViewById(R.id.pessoas);
        resultado = findViewById(R.id.resultado);
        porcento  = findViewById(R.id.porcento);

    }

    public void calculo(View v){
        String total = comanda.getText().toString();
        String p = pessoas.getText().toString();

        if(v.getId()==R.id.cacular){
            if(porcento.isChecked()){

                float vTotal01        = Float.parseFloat(total);
                float vTotal02        = (float) (vTotal01 + (vTotal01*0.1));
                float totalPessoas    = Float.parseFloat(p);
                float valorPorPessoa = vTotal02 / totalPessoas;
                resultado.setText("O valor por pessoa é de:" + String.valueOf(valorPorPessoa)+"R$");

            }else{
                float vTotal         = Float.parseFloat(total);
                float qPessoas       = Float.parseFloat(p);
                float valorPorPessoa = vTotal / qPessoas;
                resultado.setText("O valor por pessoa é de:" + String.valueOf(valorPorPessoa)+"R$");
            }
        }

    }
}
