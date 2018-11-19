package com.example.bacha.petagram;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //SwipeRefreshLayout sfiRefresh;
    //ListView lvLista;
    //Adapter adapter; //axuliar para manejar los datos en la lista

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*sfiRefresh = findViewById(R.id.sfi_refresh);
        lvLista = findViewById(R.id.lv_lista);
        String[] planetas = getResources().getStringArray(R.array.planetas); //referencia a el arreglo de plaentas en STRING
        lvLista.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, planetas));
        sfiRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //lo que se va aporceder al refrescar
                refrescandoContenido();
            }
        });*/
        agregarFab();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        Toast.makeText(MainActivity.this, "Saliendo de la App", Toast.LENGTH_SHORT).show();

    }

    /*public void refrescandoContenido(){
        String[] planetas = getResources().getStringArray(R.array.planetas);
        lvLista.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, planetas));
        sfiRefresh.setRefreshing(false); //refrecar
    }*/

    public void agregarFab(){
        FloatingActionButton miFab = (FloatingActionButton) findViewById(R.id.fb_icon);
        miFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getBaseContext(), getResources().getString(R.string.mensaje), Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "mensaje", Toast.LENGTH_SHORT).show();
                Snackbar.make(v,getResources().getString(R.string.mensaje),Snackbar.LENGTH_LONG)
                        .setAction(getResources().getString(R.string.textoAccion), new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                //Toast.makeText(MainActivity.this, "Click en Snackbar", Toast.LENGTH_SHORT).show();
                                Intent intentList = new Intent(getApplicationContext(),ListaPlaneta.class);
                                startActivity(intentList);
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.colorWhite))
                        .show();
            }
        });
    }
}
