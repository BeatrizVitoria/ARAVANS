package com.example.aravans;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {

    public Conexao(Context context) {
        super(context, "VANS", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE VANS (CODIGO INTEGER PRIMARY KEY, FOTO VARCHAR(500), PLACA VARCHAR(10), UFPLACA VARCHAR(4), RESPONSAVEL VARCHAR(75)," +
                " ORIGEM VARCHAR(65), DESTINO VARCHAR(65), PERCURSO VARCHAR(200), HORARIO VARCHAR(10));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS VANS";
        db.execSQL(sql);
        onCreate(db);
    }
}