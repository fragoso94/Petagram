package com.example.bacha.petagram;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregarFab();
    }

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
                                Toast.makeText(MainActivity.this, "Click en Snackbar", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.colorWhite))
                        .show();
            }
        });
    }
}
