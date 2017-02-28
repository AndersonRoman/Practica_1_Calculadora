package com.andersonroman.punto_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eBanda1,eBanda2,ebanda3,eTolerancia, eResultado;
    Button bCalcular;
    Double banda1,banda2,banda3,tolerancia,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eBanda1=(EditText) findViewById(R.id.eBanda1);
        eBanda2= (EditText) findViewById(R.id.eBanda2);
        ebanda3=(EditText) findViewById(R.id.eBanda3);
        eTolerancia= (EditText) findViewById(R.id.eTolerancia);
        eResultado=(EditText) findViewById(R.id.eResultado);
        bCalcular=(Button) findViewById(R.id.bCalcular);
    }

    public void click(View view) {
        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(eBanda1.getText().toString().isEmpty() && eBanda2.getText().toString().isEmpty() && ebanda3.getText().toString().isEmpty() && eTolerancia.getText().toString().isEmpty())){
                    banda1=Double.parseDouble(eBanda1.getText().toString());
                    banda2=Double.parseDouble(eBanda2.getText().toString());
                    banda3=Double.parseDouble(ebanda3.getText().toString());
                    tolerancia=Double.parseDouble(eTolerancia.getText().toString());

                    resultado=(banda1*10+banda2)*Math.pow(10,banda3);

                    //String.format("%.2f")
                    eResultado.setText(String.valueOf(resultado+"+/-"+tolerancia+"%"));
                    //eResultado.setText(String.valueOf(resultado));
                }
            }
        });
    }
}
