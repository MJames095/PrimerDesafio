package sv.edu.udb.dsm.guia3.examenpractico;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLogin(View v){
        Intent llamar = new Intent( getApplicationContext(), examen_login.class);
        startActivity(llamar);
    }
}