package org.jcloarca.cafkinal;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    private EditText txtPedir;
    private Button btnPedir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtPedir =(EditText)findViewById(R.id.txtPedir);
        btnPedir = (Button) findViewById(R.id.btnPedir);
        btnPedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v,"Botón Pedir clickeado!", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
