package com.example.aravans;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class VansBD {

    private Conexao conn; // atributo para a a classe conexao
    private SQLiteDatabase banco;

    public VansBD(Context context) {

        conn = new Conexao(context);
        banco = conn.getWritableDatabase();
    }

    public long inserir(Vans vans) {

        ContentValues dados = new ContentValues();

        dados.put("FOTO", vans.getFoto());
        dados.put("PLACA", vans.getPlaca());
        dados.put("UFPLACA", vans.getUfPlaca());
        dados.put("RESPONSAVEL", vans.getResponsavel());
        dados.put("ORIGEM", vans.getOrigem());
        dados.put("DESTINO", vans.getDestino());
        dados.put("PERCURSO", vans.getPercurso());
        dados.put("HORARIO", vans.getHorario());
        return banco.insert("vans",null, dados);

    }


    public void atualizar(Vans vans) {

        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues dados = preencherDados(vans);
        String[] parametro = {String.valueOf(vans.getPlaca())};

        db.update("VANS", dados, "codigo = ?", parametro);
        db.close();
    }

    public void deletar(Vans vans) {
        SQLiteDatabase db = conn.getWritableDatabase();
        String[] parametro = {String.valueOf(vans.getPlaca())};

        db.delete("VANS", "codigo = ?", parametro);
        db.close();
    }



    private ContentValues preencherDados(Vans vans) {

        ContentValues dados = new ContentValues();



        return dados;
    }

}