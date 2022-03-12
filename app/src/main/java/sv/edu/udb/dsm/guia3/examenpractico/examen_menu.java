package sv.edu.udb.dsm.guia3.examenpractico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class examen_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_menu);
    }

    public void finalizar(View v){
        finish();
    }

    public void onClickEj1(View v){
        Intent llamar = new Intent( getApplicationContext(), examen_ejercicio1.class);
        startActivity(llamar);
    }
}