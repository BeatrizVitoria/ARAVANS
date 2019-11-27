package com.example.aravans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        /*
        RadioButton rbMotorista = findViewById(R.id.rd_bt_motorista);
        rbMotorista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View v) {
                if (rbMotorista.isSelected()) {
                    Intent minhaIntent = new Intent(LoginActivity.this, MotoristaActivity.class);
                    startActivity(minhaIntent);
                    finish();
                }

            }
        });
         */
        final RadioButton radioButtonCliente = (RadioButton) findViewById(R.id.rd_bt_cliente);
        final RadioButton radioButtonMotorista = (RadioButton) findViewById(R.id.rd_bt_motorista);

        Button botaoEntrar = findViewById(R.id.bt_entrar);
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButtonCliente.isChecked()){
                    Intent minhaIntent = new Intent(LoginActivity.this, ListaRotas.class);
                    startActivity(minhaIntent);
                    finish();

                } else if (radioButtonMotorista.isChecked()){
                    Intent minhaIntent = new Intent(LoginActivity.this, MotoristaActivity.class);
                    startActivity(minhaIntent);
                    finish();
                }
            }
        });
    }
}