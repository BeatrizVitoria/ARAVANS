package com.example.aravans;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class VansBD{

    private Conexao conn; // atributo para a a classe conexao
    private SQLiteDatabase banco;

    /*public void onCreate(Bundle a){
        super.onCreate(a);
        setContentView(R.layout.bd_teste);

        listarVans();
    }*/

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


    public List<Vans> listarVans() {
        List<Vans> list = new ArrayList<>();

        String sql = "SELECT * FROM VANS;";
        SQLiteDatabase db = conn.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        while (cursor.moveToNext()){

            String foto = cursor.getString(cursor.getColumnIndex("FOTO"));
            String placa = cursor.getString(cursor.getColumnIndex("PLACA"));
            String ufPlaca = cursor.getString(cursor.getColumnIndex("UFPLACA"));
            String responsavel = cursor.getString(cursor.getColumnIndex("RESPONSAVEL"));
            String origem = cursor.getString(cursor.getColumnIndex("ORIGEM"));
            String destino = cursor.getString(cursor.getColumnIndex("DESTINO"));
            String percurso = cursor.getString(cursor.getColumnIndex("PERCURSO"));
            String horario = cursor.getString(cursor.getColumnIndex("HORARIO"));

            list.add(new Vans(foto, placa, ufPlaca, responsavel, origem, destino, percurso, horario));
        }

        //Encerrar e liberar o cursor
        cursor.close();
        db.close();

        return list;
    }

    private ContentValues preencherDados(Vans vans) {

        ContentValues dados = new ContentValues();
        return dados;
    }

}