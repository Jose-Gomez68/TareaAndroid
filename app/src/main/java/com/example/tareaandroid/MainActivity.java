package com.example.tareaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

     int dia,mes,anio;
     TextView fechaC;
     private EditText nombre;
     private EditText tel;
     private EditText email;
     private EditText descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        // variables de mis edittext del grafico
        fechaC = (EditText) findViewById ( R.id.EdTxfechaNac );
        nombre = (EditText) findViewById ( R.id.EdTxNombre );
        tel = (EditText) findViewById ( R.id.EdTxTelefono );
        email = (EditText) findViewById ( R.id.EdTxEmail );
        descripcion = (EditText) findViewById ( R.id.EdTxDescripcion );

  // funcion que cacha los datos de editar
       Recup ();

    }

    private void Recup() {

            String nombree = "a", fechaa = "a", telefonoo = "a", emaill = "a", descripcionn = "a";
        //cachando el Intent sin crear mas variables
            nombree = getIntent ().getStringExtra ( "nombree" );
            fechaa = getIntent ().getStringExtra ( "fechaa" );
            telefonoo = getIntent ().getStringExtra ( "tell" );
            emaill = getIntent ().getStringExtra ( "emaill" );
            descripcionn = getIntent ().getStringExtra ( "descripcionn" );


                nombre.setText ( nombree );
                tel.setText ( telefonoo );
                fechaC.setText ( fechaa );
                email.setText ( emaill );
                descripcion.setText ( descripcionn );

    }





    public void fechaCump (View view) {

        final Calendar c = Calendar.getInstance ();
        dia=c.get ( Calendar.DAY_OF_MONTH );
        mes = c.get ( Calendar.MONTH );
        anio = c.get ( Calendar.YEAR );

        DatePickerDialog datePickerDialog = new DatePickerDialog ( this, new DatePickerDialog.OnDateSetListener () {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                fechaC.setText(dayOfMonth+"/"+(month+1)+"/"+year);
            }
        } ,anio,mes,dia);// coloca talcual la fecha si no la pones asi te pondra en el año 1900
        datePickerDialog.show ();

    }

    public void SigueinteV (View Sv){


        Intent i = new Intent ( this, ConfirmarD.class );
        i.putExtra ( "nombre",nombre.getText ().toString () );
        i.putExtra ( "fecha",fechaC.getText ().toString () );
        i.putExtra ( "tel",tel.getText ().toString () );
        i.putExtra ( "email",email.getText ().toString () );
        i.putExtra ( "descripcion",descripcion.getText ().toString () );
        startActivity ( i );
       // finish ();

    }



}
