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


    }
        public void Salvar (View view){
            Vans van = new Vans(0, "2", Placa, UfPlaca, Responsavel, Origem, Destino, Percurso, Horario);
            van.setCodigo(Codigo.getInt().toString());
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