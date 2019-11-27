package com.example.aravans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MotoristaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle meuBundle){
        super.onCreate(meuBundle);
        setContentView(R.layout.tela_motorista);

        Button botaoCadastrarRota = findViewById(R.id.bt_cadastrar_rota);
        botaoCadastrarRota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent minhaIntent = new Intent(MotoristaActivity.this, CadastroRota.class);
                startActivity(minhaIntent);
                finish();
            }
        });
        Button botaoCadastrarVan = findViewById(R.id.bt_cadastrar_van);
        botaoCadastrarVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent minhaIntent = new Intent(MotoristaActivity.this, CadastroVan.class);
                startActivity(minhaIntent);
                finish();
            }
        });
    }
}
