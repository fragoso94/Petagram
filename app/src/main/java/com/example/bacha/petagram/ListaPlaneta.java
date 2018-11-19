package com.example.bacha.petagram;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListaPlaneta extends AppCompatActivity {
    SwipeRefreshLayout sfiRefresh;
    ListView lvLista;
    Adapter adapter; //axuliar para manejar los datos en la lista

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_planeta);
        sfiRefresh = findViewById(R.id.sfi_refresh);
        lvLista = findViewById(R.id.lv_lista);

        String[] planetas = getResources().getStringArray(R.array.planetas); //referencia a el arreglo de plaentas en STRING
        lvLista.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, planetas));
        sfiRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //lo que se va aporceder al refrescar
                refrescandoContenido();
                Toast.makeText(ListaPlaneta.this, "Lista actualizada", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void refrescandoContenido(){
        String[] planetas = getResources().getStringArray(R.array.planetas);
        lvLista.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, planetas));
        sfiRefresh.setRefreshing(false); //refrecar
    }
}
