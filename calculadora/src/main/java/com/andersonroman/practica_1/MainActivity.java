package com.andersonroman.practica_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b0,b1;
    EditText eNumero, eResultado;
    double resultado,op1,op2;
    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNumero=(EditText) findViewById(R.id.eNumero);
        eResultado=(EditText) findViewById(R.id.eResultado);
    }
    public void click(View view){
        int id=view.getId();
        switch (id){
            case R.id.b0: eNumero.setText(eNumero.getText()+"0");
                break;
            case R.id.b1: eNumero.setText(eNumero.getText()+"1");
                break;
            case R.id.b2: eNumero.setText(eNumero.getText()+"2");
                break;
            case R.id.b3: eNumero.setText(eNumero.getText()+"3");
                break;
            case R.id.b4: eNumero.setText(eNumero.getText()+"4");
                break;
            case R.id.b5: eNumero.setText(eNumero.getText()+"5");
                break;
            case R.id.b6: eNumero.setText(eNumero.getText()+"6");
                break;
            case R.id.b7: eNumero.setText(eNumero.getText()+"7");
                break;
            case R.id.b8: eNumero.setText(eNumero.getText()+"8");
                break;
            case R.id.b9: eNumero.setText(eNumero.getText()+"9");
                break;
            case R.id.bMas:
                op1=Double.parseDouble(eNumero.getText().toString());
                eNumero.setText("");
                flag=1;
                eResultado.setText(String.valueOf(op1));
                break;
            case R.id.bMenos:
                op1=Double.parseDouble(eNumero.getText().toString());
                eNumero.setText("");
                eResultado.setText(String.valueOf(op1));
                flag=2;
                break;
            case R.id.bMulti:
                op1=Double.parseDouble(eNumero.getText().toString());
                eNumero.setText("");
                eResultado.setText(String.valueOf(op1));
                flag=3;
                break;
            case R.id.bDiv:
                op1=Double.parseDouble(eNumero.getText().toString());
                eNumero.setText("");
                eResultado.setText(String.valueOf(op1));
                flag=4;
                break;
            case R.id.bIgual:
                op2=Double.parseDouble(eNumero.getText().toString());
                switch (flag) {
                    case 1:
                        resultado = op1 + op2;
                        eResultado.setText(String.valueOf(resultado));
                        break;
                    case 2:
                        resultado = op1 - op2;
                        eResultado.setText(String.valueOf(resultado));
                        break;
                    case 3:
                        resultado = op1 * op2;
                        eResultado.setText(String.valueOf(resultado));
                        break;
                    case 4:
                        if(op2==0){
                            Toast.makeText(getApplicationContext(),"La division por cero no es posible",Toast.LENGTH_SHORT).show();
                            break;
                        }
                        resultado = op1 / op2;
                        eResultado.setText(String.valueOf(resultado));
                        break;
                }
                break;
            case R.id.bC: eResultado.setText("");
                        eNumero.setText("");
                break;
            case R.id.bPunto:eNumero.setText(eNumero.getText()+".");
                break;
        }
    }
}
