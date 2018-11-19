package com.example.bacha.petagram;

import android.support.design.widget.FloatingActionButton;
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
                Toast.makeText(MainActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
