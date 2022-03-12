package sv.edu.udb.dsm.guia3.examenpractico;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class examen_ejercicio1 extends AppCompatActivity {

    EditText valuea, valueb, valuec;
    Button btncalculo;
    TextView resultado;
    double a, b , c, d, x1, x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_ejercicio1);

        valuea = findViewById(R.id.valuea);
        valueb = findViewById(R.id.valueb);
        valuec = findViewById(R.id.valuec);
        btncalculo = findViewById(R.id.btncalculo);
        resultado = findViewById(R.id.resultado);

        btncalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!valuea.getText().toString().equals("") && !valueb.getText().toString().equals("") && !valuec.getText().toString().equals("")) {
                    a = Double.parseDouble(valuea.getText().toString());
                    b = Double.parseDouble(valueb.getText().toString());
                    c = Double.parseDouble(valuec.getText().toString());

                    d = Math.pow(b, 2) - 4*a*c;

                    if (d == 0) {
                        x1 = -b / (2*a);
                        resultado.setText("d = " + d + "\nx = " + x1);
                    } else if(d < 0) {
                        resultado.setText("¡No hay resultado!");
                    } else if(d > 0) {
                        x1 = (-b + Math.sqrt(d))/(2*a);
                        x2 = (-b - Math.sqrt(d))/(2*a);
                        resultado.setText("d = " + d + "\nx1 = " + x1 + " \nx2 = " + x2);
                    }
                }
            }
        });
    }

    public void finalizar(View v) {
        finish();
    }
}