package com.example.tareaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarD extends AppCompatActivity {

    private TextView TvNombre;
    private TextView TvFecha;
    private TextView TvTel;
    private TextView TvEmail;
    private TextView TvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_confirmar_d );

        Bundle parametros   = getIntent ().getExtras ();
        String nombre       = parametros.getString ( "nombre" );
        String fecha        = parametros.getString ( "fecha" );
        String telefono     = parametros.getString ( "tel" );
        String email        = parametros.getString ( "email" );
        String descripcion  = parametros.getString ( "descripcion" );

        TvNombre    = (TextView) findViewById ( R.id.TextNombre );
        TvFecha     = (TextView) findViewById ( R.id.TextFecha );
        TvTel       = (TextView) findViewById ( R.id.TextTel );
        TvEmail     = (TextView) findViewById ( R.id.TxtEmail );
        TvDescripcion = (TextView) findViewById ( R.id.TxtDescripcion );

        TvNombre.setText ( nombre );
        TvFecha.setText ( fecha );
        TvEmail.setText ( email );
        TvTel.setText ( telefono );
        TvDescripcion.setText ( descripcion );

    }

    public void VentanaG (View Vg){


        Intent ii = new Intent ( this, MainActivity.class );
        ii.putExtra ( "nombree",TvNombre.getText ().toString ());
        ii.putExtra ( "fechaa",TvFecha.getText ().toString () );
        ii.putExtra ( "tell",TvTel.getText ().toString () );
        ii.putExtra ( "emaill",TvEmail.getText ().toString () );
        ii.putExtra ( "descripcionn",TvDescripcion.getText ().toString () );
        startActivity ( ii );
        finish ();

    }

}
