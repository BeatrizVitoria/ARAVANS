package com.example.aravans;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroVan extends AppCompatActivity {

    /*private EditText placa;
    private EditText ufPlaca;
    private EditText responsavel;
    private EditText origem;
    private EditText destino;
    private EditText percurso;
    private EditText horario;*/

    private VansBD vansBD;

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

            //    vansBD = new VansBD(this);

                    Vans van = new Vans(0, "", placa, ufPlaca, responsavel, origem, destino, percurso, horario);

                    new VansBD(CadastroVan.this).adicionar(van);

                    Toast.makeText(getApplicationContext(), "Cadastrado!!", Toast.LENGTH_SHORT).show();

                }
        });
    }
}