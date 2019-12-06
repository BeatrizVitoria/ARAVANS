package com.example.aravans;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class CadastroVan extends AppCompatActivity {

    private ImageView imageViewFoto;

    @Override
    protected void onCreate(Bundle meuBundle) {
        super.onCreate(meuBundle);
        setContentView(R.layout.cadastro_vans);

        Button btVan = findViewById(R.id.bt_cadastrar);
        btVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //RECUPERAR OS EDITTEXTS
                EditText etPlaca = findViewById(R.id.placa);
                EditText etUfPlaca = findViewById(R.id.UF_Placa);
                EditText etResponsavel = findViewById(R.id.responsavel);
                EditText etOrigem = findViewById(R.id.origem);
                EditText etDestino = findViewById(R.id.destino);
                EditText etPercurso = findViewById(R.id.percurso);
                EditText etHorario = findViewById(R.id.horario);

                //RECUPERA O TEXTO

                String placa = etPlaca.getText().toString();
                String ufPlaca = etUfPlaca.getText().toString();
                String responsavel = etResponsavel.getText().toString();
                String origem = etOrigem.getText().toString();
                String destino = etDestino.getText().toString();
                String percurso = etPercurso.getText().toString();
                String horario = etHorario.getText().toString();
                //falta recuperar o da foto

                //Vans van = new Vans("123", placa, ufPlaca, responsavel, origem, destino, percurso, horario);

                Toast.makeText(getApplicationContext(), "Cadastrado!!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CadastroVan.this, ListaRotasActivity.class);
                //intent.putExtra("van", van);
                startActivity(intent);

            }
        });

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) !=
                PackageManager.PERMISSION_GRANTED) { // checa a permissão no manifest
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 0);

        }
        ImageView imageViewFoto = findViewById(R.id.imageView);
        Button btImage = findViewById(R.id.btImage);
        btImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tirarfoto();
            }
        });
    }
    @NonNull
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == 1 && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imagem = (Bitmap) extras.get("data");
            imageViewFoto.setImageBitmap(imagem);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


    public void tirarfoto(){
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent,1);
        }
}