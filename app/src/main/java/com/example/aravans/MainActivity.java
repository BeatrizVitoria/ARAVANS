package com.example.aravans;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        Button bt_principal = findViewById(R.id.bt_principal);
        bt_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EscolhaDestino.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
       getMenuInflater().inflate(R.menu.activity_menu, menu);
       return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        if(item.getItemId() == R.id.bt_login){
            Intent minhaIntent = new Intent(this, LoginActivity.class);
            startActivity(minhaIntent);
        }
        else if(item.getItemId() == R.id.bt_cadastrar_cliente){
            Intent intentCliente = new Intent(this, CadastrarCliente.class);
            startActivity(intentCliente);
        }else if(item.getItemId() == R.id.bt_cadastrar_motorista){
                Intent intentMotorista = new Intent(this, CadastrarMotorista.class);
                startActivity(intentMotorista);
            }

        return super.onOptionsItemSelected(item);
    }

}
