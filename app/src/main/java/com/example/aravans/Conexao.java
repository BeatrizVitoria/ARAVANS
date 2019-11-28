package com.example.aravans;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {
    public Conexao(Context context) {
        super(context, "lista_rotas", null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE VANS(PLACA STRING PRIMARY KEY, UF_PLACA STRING, RESPONSAVEL STRING, ORIGEM STRING," +
                " DESTINO STRING, PERCURSO STRING, HORARIO TIME, FOTO TEXT);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS VANS";
        db.execSQL(sql);

        onCreate(db);
    }

}
