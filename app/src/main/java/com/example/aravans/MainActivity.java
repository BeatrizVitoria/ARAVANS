package com.example.aravans;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
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
        if(item.getItemId() == R.id.bt_cadastrar){
            Intent minhaIntent = new Intent(this, Cadastrar.class);
            startActivity(minhaIntent);
        }

        return super.onOptionsItemSelected(item);
    }

}
