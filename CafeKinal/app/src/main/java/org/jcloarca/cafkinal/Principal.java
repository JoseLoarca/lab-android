package org.jcloarca.cafkinal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Principal extends AppCompatActivity {
    private RadioGroup radioGroup;
        private RadioButton radioTazaPequeña;
        private RadioButton radioTazaGrande;
        private double precioTaza = 7.50;
    private EditText txtPedir;
    private Button btnPedir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        txtPedir =(EditText)findViewById(R.id.txtPedir);
        btnPedir = (Button) findViewById(R.id.btnPedir);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i==R.id.radioTazaPequeña){
                    precioTaza=7.50;
                }else{
                    precioTaza=12.50;
                }
            }
        });
        btnPedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v,"Botón Pedir clickeado!", Snackbar.LENGTH_SHORT).show();
                Intent intent = new Intent(Principal.this, DetalleCompra.class);
                intent.putExtra("pedido", txtPedir.getText().toString());
                intent.putExtra("precioTaza", precioTaza);
                startActivity(intent);
            }
        });
    }
}
