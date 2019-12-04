package com.example.aravans;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class VansBD extends SQLiteOpenHelper {

    public VansBD(Context context) {
        super(context, "banco_de_dados", null, 1);
    }

    public void onCreate(SQLiteDatabase banco) {
        banco.execSQL("CREATE TABLE VANS(codigo integer primary key autoincrement, foto varchar(500), placa varchar(18), ufPlaca varchar(4), responsavel varchar(60), origem varchar(65), destino varchar(65), percurso varchar(65), horario varchar(10));");
    }

    public void onUpgrade(SQLiteDatabase banco, int versaoAntiga, int versaoNova) {
        banco.execSQL("DROP TABLE VANS");
        this.onCreate(banco);
    }

    public ContentValues obterDados(Vans vans) {
        // Chave -> valor
        ContentValues values = new ContentValues();

        values.put("foto", vans.getFoto());
        values.put("placa", vans.getPlaca());
        values.put("ufPlaca", vans.getUfPlaca());
        values.put("responsavel", vans.getResponsavel());
        values.put("origem", vans.getOrigem());
        values.put("destino", vans.getDestino());
        values.put("percurso", vans.getPercurso());
        values.put("horario", vans.getHorario());

        return values;
    }

    public SQLiteDatabase db() {
        return getWritableDatabase();
    }

    public void adicionar(Vans vans) {
        ContentValues values = obterDados(vans);

        db().insert("VANS", null, values);
    }

    public void atualizar(Vans vans) {
        ContentValues values = obterDados(vans);

        String[] argumentos = { String.valueOf(vans.getCodigo()) };

        db().update("VANS", values, "codigo=?", argumentos);
    }

    public void deletar(int codigo) {
        String[] argumentos = { String.valueOf(codigo) };

        db().delete("VANS", "codigo=?", argumentos);
    }

    public ArrayList<Vans> recuperarTodos() {
        ArrayList<Vans> vans = new ArrayList<>();

        try {

            Cursor cursor = db().rawQuery("SELECT * FROM VANS", null);

            while (cursor.moveToNext()) {
                vans.add(new Vans(
                        cursor.getInt(cursor.getColumnIndex("codigo")),
                        cursor.getString(cursor.getColumnIndex("foto")),
                        cursor.getString(cursor.getColumnIndex("placa")),
                        cursor.getString(cursor.getColumnIndex("ufplaca")),
                        cursor.getString(cursor.getColumnIndex("responsavel")),
                        cursor.getString(cursor.getColumnIndex("origem")),
                        cursor.getString(cursor.getColumnIndex("destino")),
                        cursor.getString(cursor.getColumnIndex("percurso")),
                        cursor.getString(cursor.getColumnIndex("horario"))
                ));
            }
        } catch (SQLiteException e) {
        }

        return vans;
    }
}
