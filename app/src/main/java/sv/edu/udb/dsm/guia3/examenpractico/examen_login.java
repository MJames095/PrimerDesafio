package sv.edu.udb.dsm.guia3.examenpractico;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class examen_login extends AppCompatActivity {

    EditText usuario, contra;
    Button inicio;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_login);

        usuario=findViewById(R.id.usuario);
        contra=findViewById(R.id.contra);
        inicio=findViewById(R.id.btn1);
        db = new DBHelper( this);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String user=usuario.getText().toString();
               String pass=contra.getText().toString();

               if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                   Toast.makeText( examen_login.this, "Rellene los campos", Toast.LENGTH_SHORT).show();
               else{
                   Boolean checkuserpass= db.checkusernamepassword(user,pass);
                   if(checkuserpass==true) {
                       Toast.makeText( examen_login.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                       Intent intent = new Intent(getApplicationContext(), examen_menu.class);
                       startActivity(intent);
                   } else {
                       Toast.makeText( examen_login.this, "Error, intentelo de nuevo", Toast.LENGTH_SHORT).show();
                   }
               }
            }
        });
    }




}