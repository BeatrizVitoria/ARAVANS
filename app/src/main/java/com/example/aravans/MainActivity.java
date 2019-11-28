package com.example.aravans;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        Button bt_destino = findViewById(R.id.bt_destino);
        bt_destino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DestinoActivity.class);
                startActivity(intent);
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
        else if(item.getItemId() == R.id.bt_cadastrarCliente){
            Intent minhaIntent = new Intent(this, Cadastrar.class);
            startActivity(minhaIntent);
        }else{
                Intent minhaInt = new Intent(this, Cadastrar.class);
                startActivity(minhaInt);
            }
            return super.onOptionsItemSelected(item);
        }


    }


