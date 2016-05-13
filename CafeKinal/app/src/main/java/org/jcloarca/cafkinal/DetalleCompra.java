package org.jcloarca.cafkinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class DetalleCompra extends AppCompatActivity {
    private TextView txtTazas, txtTotal;
    private Button btnRegresar;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_compra);
        txtTazas = (TextView) findViewById(R.id.txtTazas);
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        btnRegresar = (Button) findViewById(R.id.btnRegresar);
        Bundle bundle = this.getIntent().getExtras();
        txtTazas.setText(bundle.getString("pedido").toString());
        Double total = Double.parseDouble(bundle.getString("pedido"))*(bundle.getDouble("precioTaza"));
        txtTotal.setText(total.toString());
        btnRegresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(DetalleCompra.this, Principal.class));
            }
        });
    }
}
