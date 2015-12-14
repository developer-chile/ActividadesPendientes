package com.developer_chile.manager.actividadespendientes;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Clases.Actividad;

public class RegistrarActividad extends AppCompatActivity {
    private Button btRegistrarActividad;
    private EditText etDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_actividad);

        registrarActividad();
    }

    public void registrarActividad()
    {
        try
        {
            etDescripcion = (EditText)findViewById(R.id.etDescripcion);
            btRegistrarActividad = (Button)findViewById(R.id.btRegistrarActividad);

            btRegistrarActividad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Actividad ac = new Actividad(etDescripcion.getText().toString());

                    //ADD: Registrar actividad en base de datos

                    // Inicio
                    // Toast utilizado sólo para mostrar datos de prueba
                    Toast toast = Toast.makeText(getApplicationContext(), ac.getFechaInicio().toString(), Toast.LENGTH_SHORT);
                    toast.show();
                    // Fin

                    //ADD: Redireccionar a lista de actividades pendientes que está ordenada por fecha de inicio de mayor a menor
                }
            });
        }
        catch(Exception e)
        {
            //ADD: Crear controlador de excepciones
        }
    }
}
