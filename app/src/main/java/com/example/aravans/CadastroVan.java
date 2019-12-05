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

<<<<<<< HEAD
import java.sql.SQLOutput;

public class CadastroVan extends AppCompatActivity {
=======
public class CadastroVan extends AppCompatActivity {

<<<<<<< HEAD
    /*private EditText placa;
    private EditText ufPlaca;
    private EditText responsavel;
    private EditText origem;
    private EditText destino;
    private EditText percurso;
    private EditText horario;*/

    private VansBD vansBD;
=======
    private com.example.aravans.VansBD VansBD;
    private int Codigo;
    private EditText Foto;
    private EditText Placa;
    private EditText UfPlaca;
    private EditText Responsavel;
    private EditText Origem;
    private EditText Destino;
    private EditText Percurso;
    private EditText Horario;

>>>>>>> 101b9e3148b126947d227d2394dcd7eabc87d8f0
>>>>>>> 25e4fa768f863c9e9d10c8cb7a272b0314608835

    @Override
    protected void onCreate(Bundle meuBundle) {
        super.onCreate(meuBundle);
        setContentView(R.layout.cadastro_vans);

        Button btVan = findViewById(R.id.bt_cadastrar);
        btVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //RECUPERAR OS EDITTEXTS
<<<<<<< HEAD
                EditText etPlaca = findViewById(R.id.placa);
                EditText etUfPlaca = findViewById(R.id.UF_Placa);
                EditText etResponsavel = findViewById(R.id.responsavel);
                EditText etOrigem = findViewById(R.id.origem);
                EditText etDestino = findViewById(R.id.destino);
                EditText etPercurso = findViewById(R.id.percurso);
                EditText etHorario = findViewById(R.id.horario);

                //RECUPERA O TEXTO
                String foto = "ddede";
                String placa = etPlaca.getText().toString();
                String ufPlaca = etUfPlaca.getText().toString();
                String responsavel = etResponsavel.getText().toString();
                String origem = etOrigem.getText().toString();
                String destino = etDestino.getText().toString();
                String percurso = etPercurso.getText().toString();
                String horario = etHorario.getText().toString();
                //falta recuperar o da foto

                //Salvando
                VansBD vansBD = new VansBD(CadastroVan.this);

                Intent intent = getIntent();
                if(intent.hasExtra("vans"));
                Vans van = new Vans(foto, placa, ufPlaca, responsavel,origem, destino, percurso, horario);

                vansBD.inserir(van);
                System.out.println(van.toString());

                Toast.makeText(getApplicationContext(), horario, Toast.LENGTH_SHORT).show();

            }
        });
=======
                Placa = findViewById(R.id.placa);
                UfPlaca = findViewById(R.id.UF_Placa);
                Responsavel = findViewById(R.id.responsavel);
                Origem = findViewById(R.id.origem);
                Destino = findViewById(R.id.destino);
                Percurso = findViewById(R.id.percurso);
                Horario = findViewById(R.id.horario);
                VansBD = new VansBD(this);


<<<<<<< HEAD
            //    vansBD = new VansBD(this);

                    Vans van = new Vans(0, "", placa, ufPlaca, responsavel, origem, destino, percurso, horario);

                    new VansBD(CadastroVan.this).adicionar(van);

                    Toast.makeText(getApplicationContext(), "Cadastrado!!", Toast.LENGTH_SHORT).show();

                }
        });
=======
>>>>>>> 101b9e3148b126947d227d2394dcd7eabc87d8f0
>>>>>>> 25e4fa768f863c9e9d10c8cb7a272b0314608835
    }
}