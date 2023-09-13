package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //atributos
    EditText cajaUsuario;
    EditText cajaContrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cajaUsuario=findViewById(R.id.usuario);
        cajaContrasena=findViewById((R.id.contrasena));

        //capturando datos de los etittext
        String nombreUsuario=cajaUsuario.getText().toString();
        String contrasena=cajaContrasena.getText().toString();

        Intent intent=new Intent(Login.this,Home.class);

        //pasando datos ala nueva actividad

        intent.putExtra("nombre",nombreUsuario);
        intent.putExtra("password",contrasena);

        startActivity(intent);

    }
}