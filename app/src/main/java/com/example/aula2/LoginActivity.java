package com.example.aula2;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText editEmail;
    private EditText editSenha;
    private Button btnCadastrar;
    private Button btnEntrar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        editEmail = findViewById(R.id.editEmail);
        editSenha =  findViewById(R.id.editSenha);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editEmail.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Campo Obrigatório", Toast.LENGTH_LONG);
                } else if(editSenha.getText().toString().isEmpty()) {
                    editSenha.setError("Campo Obrigatório");
                } else {
                }

                Intent it = new Intent(LoginActivity.this, MainActivity.class);
                it.putExtra("KEY LEGENDA", editEmail.getText().toString());
                startActivity(it);
            }
        });
    }
}
