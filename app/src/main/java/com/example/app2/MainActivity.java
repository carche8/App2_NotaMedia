package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tc1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.nota1);
        et2 = (EditText)findViewById(R.id.nota2);
        et3 = (EditText)findViewById(R.id.nota3);
        tc1 = (TextView)findViewById(R.id.textViewResultado) ;
    }
// Este método realiza la media de tres asignaturas e indica si esta "aprobado" o "suspendido" //

    public void Media (View view) {
        String Mate = et1.getText().toString();
        String Quimica = et2.getText().toString();
        String Lengua = et3.getText().toString();

        int nMate = Integer.parseInt(Mate);
        int nQuimica = Integer.parseInt(Quimica);
        int nLengua = Integer.parseInt(Lengua);

        int media = (nMate + nQuimica + nLengua) / 3;
        String resultado = "";

        if (media >=5) {
            System.out.println("Tu nota es " + media + " has aprobado");
        }
        else  {
            System.out.println("Tu nota es " + media + " has suspendido");
        }

        tc1.setText(resultado);

    }
}
