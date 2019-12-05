package com.example.aravans;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {
    private static final String name = "Vans"; //nome do banco
    private static final int version = 1; //versão


    private static final String name = "vans.db";
    private static final int version = 1;

    public Conexao(Context context) {
        super(context, name , null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
<<<<<<< HEAD
        db.execSQL("CREATE TABLE VANS (CODIGO INTEGER PRIMARY KEY, FOTO VARCHAR(500), PLACA VARCHAR(10), UFPLACA VARCHAR(4), RESPONSAVEL VARCHAR(75)," +
                " ORIGEM VARCHAR(65), DESTINO VARCHAR(65), PERCURSO VARCHAR(200), HORARIO VARCHAR(10))");
=======
        db.execSQL ("CREATE TABLE VANS (CODIGO INTEGER PRIMARY KEY autoincrement, FOTO VARCHAR(500), PLACA VARCHAR(10), UFPLACA VARCHAR(4), RESPONSAVEL VARCHAR(75)," +
                " ORIGEM VARCHAR(65), DESTINO VARCHAR(65), PERCURSO VARCHAR(200), HORARIO VARCHAR(10)");
>>>>>>> 101b9e3148b126947d227d2394dcd7eabc87d8f0
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS VANS";
        db.execSQL(sql);
        onCreate(db);
    }
}