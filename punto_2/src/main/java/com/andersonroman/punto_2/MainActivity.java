package com.andersonroman.punto_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ePracticas, eAvanceI, eAvanceII,eAvanceIII, eFinal;
    Button bCalcular;
    double practicas,avanceI,avanceII,avanceIII,pfinal,notaFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ePracticas=(EditText) findViewById(R.id.ePracticas);
        eAvanceI= (EditText) findViewById(R.id.eAvanceI);
        eAvanceII=(EditText) findViewById(R.id.eAvanceII);
        eAvanceIII= (EditText) findViewById(R.id.eAvanceIII);
        eFinal= (EditText) findViewById(R.id.eAvanceIII);

        bCalcular= (Button) findViewById(R.id.bCalcular);

    }

    public void click(View view) {

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!(ePracticas.getText().toString().isEmpty()&& eAvanceI.getText().toString().isEmpty() && eAvanceII.getText().toString().isEmpty() && eAvanceIII.getText().toString().isEmpty() && eFinal.getText().toString().isEmpty() )){
                    practicas=Double.parseDouble(ePracticas.getText().toString());
                    avanceI=Double.parseDouble(eAvanceI.getText().toString());
                    avanceII=Double.parseDouble(eAvanceII.getText().toString());
                    avanceIII=Double.parseDouble(eAvanceIII.getText().toString());
                    pfinal=Double.parseDouble(eFinal.getText().toString());

                    notaFinal=practicas*.6+avanceI*.05+avanceII*.07+avanceIII*.08+pfinal*.2;

                    if (notaFinal>=0 && notaFinal<=1){
                        Toast.makeText(MainActivity.this,"Estas en el lugar equivocado",Toast.LENGTH_LONG).show();
                    }
                    if (notaFinal>1 && notaFinal<=2){
                        Toast.makeText(MainActivity.this,"Remal",Toast.LENGTH_LONG).show();
                    }
                    if (notaFinal>2 && notaFinal<=3){
                        Toast.makeText(MainActivity.this,"Es posible recuperarse",Toast.LENGTH_LONG).show();
                    }
                    if (notaFinal>3 && notaFinal<=4){
                        Toast.makeText(MainActivity.this,"Normalito",Toast.LENGTH_LONG).show();
                    }
                    if (notaFinal>4 && notaFinal<=4.5){
                        Toast.makeText(MainActivity.this,"Muy Bien",Toast.LENGTH_LONG).show();
                    }
                    if (notaFinal>4.5&& notaFinal<=5){
                        Toast.makeText(MainActivity.this,"Excenlente estudiante",Toast.LENGTH_LONG).show();
                    }

                }
            }
        });
    }
}
