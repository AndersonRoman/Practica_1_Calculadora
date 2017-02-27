package com.andersonroman.punto_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import static com.andersonroman.punto_1.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    RadioButton rCuadrado, rCirculo, rTriangulo,rCubo;
    EditText eLado,eRadio,eBase,eAltura,ePerimetro,eArea,eVolumen;
    Button bCalcular;
    double Lado, Radio, Base, Altura, Perimetro, Area, Volumen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rCuadrado= (RadioButton) findViewById(R.id.rCuadrado);
        rCirculo= (RadioButton) findViewById(R.id.rCirculo);
        rTriangulo=(RadioButton) findViewById(R.id.rTriangulo);
        rCubo=(RadioButton) findViewById(R.id.rCubo);

        eLado=(EditText) findViewById(R.id.eLado);
        eRadio=(EditText) findViewById(R.id.eRadio);
        eBase=(EditText) findViewById(R.id.eBase);
        eAltura=(EditText) findViewById(R.id.eAltura);
        ePerimetro=(EditText) findViewById(R.id.ePerimetro);
        eArea=(EditText) findViewById(R.id.eArea);
        eVolumen=(EditText) findViewById(R.id.eVolumen);

        bCalcular=(Button) findViewById(R.id.bCalcular);

        eLado.setVisibility(android.view.View.INVISIBLE);
        eRadio.setVisibility(android.view.View.INVISIBLE);
        eBase.setVisibility(android.view.View.INVISIBLE);
        eAltura.setVisibility(android.view.View.INVISIBLE);
        eVolumen.setVisibility(android.view.View.INVISIBLE);
    }

    public void click(android.view.View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rCuadrado:
                if (checked){
                    rCirculo.setChecked(false);
                    rTriangulo.setChecked(false);
                    rCubo.setChecked(false);
                    eLado.setVisibility(android.view.View.VISIBLE);
                    eRadio.setVisibility(android.view.View.INVISIBLE);
                    eBase.setVisibility(android.view.View.INVISIBLE);
                    eAltura.setVisibility(android.view.View.INVISIBLE);
                    eVolumen.setVisibility(android.view.View.INVISIBLE);

                    bCalcular.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (!eLado.getText().toString().isEmpty()) {
                                Lado = Double.parseDouble(eLado.getText().toString());
                                Perimetro = 4 * Lado;
                                Area = Lado * Lado;
                                ePerimetro.setText(String.valueOf(Perimetro));
                                eArea.setText(String.valueOf(Area));
                            }
                        }
                    });

                }
                break;
            case R.id.rCirculo:
                if (checked){
                    rCuadrado.setChecked(false);
                    rTriangulo.setChecked(false);
                    rCubo.setChecked(false);
                    eRadio.setVisibility(android.view.View.VISIBLE);
                    eLado.setVisibility(android.view.View.INVISIBLE);
                    eBase.setVisibility(android.view.View.INVISIBLE);
                    eAltura.setVisibility(android.view.View.INVISIBLE);
                    eVolumen.setVisibility(android.view.View.INVISIBLE);

                    bCalcular.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (!eRadio.getText().toString().isEmpty()){
                                Radio=Double.parseDouble(eRadio.getText().toString());
                                Perimetro=2*Math.PI*Radio;
                                Area=Math.PI*Radio*Radio;
                                ePerimetro.setText(String.valueOf(Perimetro));
                                eArea.setText(String.valueOf(Area));
                            }
                        }
                    });
                }
                break;
            case R.id.rTriangulo:
                if (checked){
                    rCirculo.setChecked(false);
                    rCuadrado.setChecked(false);
                    rCubo.setChecked(false);
                    eBase.setVisibility(android.view.View.VISIBLE);
                    eAltura.setVisibility(android.view.View.VISIBLE);
                    eLado.setVisibility(android.view.View.INVISIBLE);
                    eRadio.setVisibility(android.view.View.INVISIBLE);
                    eVolumen.setVisibility(android.view.View.INVISIBLE);

                    bCalcular.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(!eBase.getText().toString().isEmpty() && !eAltura.getText().toString().isEmpty()){
                                Base=Double.parseDouble(eBase.getText().toString());
                                Altura=Double.parseDouble(eAltura.getText().toString());
                                Perimetro=3*Base;
                                Area=Base*Altura/2;
                                ePerimetro.setText(String.valueOf(Perimetro));
                                eArea.setText(String.valueOf(Area));
                            }
                        }
                    });

                }
                break;
            case R.id.rCubo:
                if (checked){
                    rCirculo.setChecked(false);
                    rTriangulo.setChecked(false);
                    rCuadrado.setChecked(false);
                    eLado.setVisibility(android.view.View.VISIBLE);
                    eVolumen.setVisibility(android.view.View.VISIBLE);
                    eRadio.setVisibility(android.view.View.INVISIBLE);
                    eBase.setVisibility(android.view.View.INVISIBLE);
                    eAltura.setVisibility(android.view.View.INVISIBLE);
                    ePerimetro.setVisibility(android.view.View.INVISIBLE);
                    eArea.setVisibility(android.view.View.INVISIBLE);

                    bCalcular.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (!eLado.getText().toString().isEmpty()) {
                                Lado = Double.parseDouble(eLado.getText().toString());
                                Volumen = Lado * Lado * Lado;
                                eVolumen.setText(String.valueOf(Volumen));
                            }
                        }
                    });
                }
                break;
        }
    }
}
