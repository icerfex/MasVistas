package com.nextsofts.masvistas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MasVistasActivity extends AppCompatActivity {
    
    private EditText entrada;
    private TextView salida;

    public MasVistasActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada=(EditText) findViewById(R.id.entrada);
        salida=(TextView) findViewById(R.id.salida);
    }

    public void sePulsa(View v){
        Toast.makeText(this,"pulsado",Toast.LENGTH_SHORT).show();
    }
    /*metodo escuchador de evento(listener)
    * toast es un aviso que permanece en la pantalla solo un tiempo y luego desaparece
    * como parametro del metodo se pasa la vista*/
    public void sePulsa0(View view)
    {
        salida.setText(entrada.getText()+(String)view.getTag());
    }
}
