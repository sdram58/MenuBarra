package com.catata.menu_barra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Con esta función Vinculamos el menú html y lo mete en la actionBar o toolBar*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_barra, menu);
        return true;
    }

    /*Aquí es donde gestionamos los manejadores de cada opción del menú*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // el parámetro item es la opción del menú pulsada por eso vemos qué id tiene para saber qué opción ha sido pulsada
        switch (item.getItemId()) {
            case R.id.add:
                Toast.makeText(getApplicationContext(),"Juego nuevo", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.help:
                Toast.makeText(getApplicationContext(),"Ayuda", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}