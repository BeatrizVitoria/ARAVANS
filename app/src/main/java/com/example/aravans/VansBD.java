package com.example.aravans;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class VansBD {

    private Conexao conn;
    private String TABLE = "VANS";

    public VansBD(Context context) {
        conn = new Conexao(context);
    }

    public void adicionar(Vans vans) {
        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues dados = preencherDados(vans);

        db.insert("VANS", null, dados);
        db.close();
    }


    public void atualizar(Vans vans) {

        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues dados = preencherDados(vans);
        String[] parametro = {String.valueOf(vans.getCodigo())};

        db.update("VANS", dados, "codigo = ?", parametro);
        db.close();
    }

    public void deletar(Vans vans) {
        SQLiteDatabase db = conn.getWritableDatabase();
        String[] parametro = {String.valueOf(vans.getCodigo())};

        db.delete("VANS", "codigo = ?", parametro);
        db.close();
    }

    public ArrayList<Vans> recuperarTudo() {
        ArrayList<Vans> list = new ArrayList<>();

        String sql = "SELECT * FROM VANS;";
        SQLiteDatabase db = conn.getWritableDatabase();

        Cursor cursor = db.rawQuery(sql, null);

        while (cursor.moveToNext()) {
            int codigo = cursor.getInt(cursor.getColumnIndex("CODIGO"));
            String foto = cursor.getString(cursor.getColumnIndex("FOTO"));
            String placa = cursor.getString(cursor.getColumnIndex("PLACA"));
            String ufPlaca = cursor.getString(cursor.getColumnIndex("UFPLACA"));
            String responsavel = cursor.getString(cursor.getColumnIndex("RESPONSAVEL"));
            String origem = cursor.getString(cursor.getColumnIndex("ORIGEM"));
            String destino = cursor.getString(cursor.getColumnIndex("DESTINO"));
            String percurso = cursor.getString(cursor.getColumnIndex("PERCURSO"));
            String horario = cursor.getString(cursor.getColumnIndex("HORARIO"));

            list.add(new Vans(codigo, foto, placa, ufPlaca, responsavel, origem, destino, percurso, horario));
        }
        cursor.close();
        db.close();

        return list;
    }

    private ContentValues preencherDados(Vans vans) {

        ContentValues dados = new ContentValues();

        dados.put("CODIGO", vans.getCodigo());
        dados.put("FOTO", vans.getFoto());
        dados.put("PLACA", vans.getPlaca());
        dados.put("UFPLACA", vans.getUfPlaca());
        dados.put("RESPONSAVEL", vans.getResponsavel());
        dados.put("ORIGEM", vans.getOrigem());
        dados.put("DESTINO", vans.getDestino());
        dados.put("PERCURSO", vans.getPercurso());
        dados.put("HORARIO", vans.getHorario());

        return dados;
    }

}