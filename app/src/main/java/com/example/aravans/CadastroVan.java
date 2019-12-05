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

    @Override
    protected void onCreate(Bundle meuBundle) {
        super.onCreate(meuBundle);
        setContentView(R.layout.cadastro_vans);

                //RECUPERAR OS EDITTEXTS
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
    }
        public void Salvar (View view){
            Vans van = new Vans(0, "2", Placa, UfPlaca, Responsavel, Origem, Destino, Percurso, Horario);
            van.setCodigo(Codigo.getInt());
            van.setFoto(Foto.getText().toString());
            van.setPlaca(Placa.getText().toString());
            van.setUfPlaca(UfPlaca.getText().toString());
            van.setResponsavel(Responsavel.getText().toString());
            van.setOrigem(Origem.getText().toString());
            van.setDestino(Destino.getText().toString());
            van.setPercurso(Percurso.getText().toString());
            van.setHorario(Horario.getText().toString());
            long id = VansBD.inserir(vans);

        }

}