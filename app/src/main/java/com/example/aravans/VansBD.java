package com.example.aravans;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public class VansBD {
    private  Conexao conexao;
    private String TABLE = "VANS";

    public VansBD(Context context) {
        conexao = new Conexao(context);
    }

    public void salvar(Vans vans){
        SQLiteDatabase db = conexao.getWritableDatabase();
        ContentValues dados = preencherDados(vans);

        db.insert(TABLE, null, dados);
        db.close();
    }

    public List<Vans> listRotas(){
        List<Vans> list = new ArrayList<>();
        String sql = "SELECT * FROM VANS;";
        SQLiteDatabase db = conexao.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        while(cursor.moveToNext){
            String placa = cursor.getString(cursor.getColumnIndex("PLACA"));
            String ufPlaca = cursor.getString(cursor.getColumnIndex("UF_PLACA"));
            String responsavel = cursor.getString(cursor.getColumnIndex("RESPONSAVEL"));
            String origem = cursor.getString(cursor.getColumnIndex("ORIGEM"));
            String destino = cursor.getString(cursor.getColumnIndex("DESTINO"));
            String percurso = cursor.getString(cursor.getColumnIndex("PERCURSO"));
            String horario = cursor.getString(cursor.getColumnIndex("HORARIO"));
            String foto = cursor.getString(cursor.getColumnIndex("FOTO"));

            list.add(new Vans(placa, ufPlaca, responsavel, origem, destino, percurso, horario, foto));
        }

    }

    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE VANS " +
                "(PLACA STRING, UF_PLACA STRING, RESPONSAVEL STRING, ORIGEM STRING, DESTINO STRING, PERCURSO STRING, HORARIO TIME " +
                "PRIMARY KEY(PLACA));";
        db.execSQL(sql);
    }

    //INVOCADO AO ATUALIZAR O BD
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS VANS";
        db.execSQL(sql);
        onCreate(db);
    }

    //SALVAR UM NOVO PRODUTO
    public void salvarVANS(Vans v) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = obterDados(v);
        db.insert("vans", null, dados);
    }

    //EDITAR UM PRODUTO
    public void atualizarProduto(Vans v) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = obterDados(v);

        String[] params = { String.valueOf(v.getPlaca()) };
        db.update("vans",dados,"CODIGO=?", params);

        db.close();
    }

    //OBTER OS DADOS DO OBJETO PRODUTO
    private ContentValues obterDados(Vans v) {
        ContentValues dados = new ContentValues();
        dados.put("PLACA", v.getPlaca());
        dados.put("UF_PLACA", v.getUfPlaca());
        dados.put("RESPONSAVEL", v.getResponsavel());
        dados.put("ORIGEM", v.getOrigem());
        dados.put("DESTINO", v.getDestino());
        dados.put("PERCURSO", v.getPercurso());
        dados.put("HORARIO", v.getHorario());
        dados.put("FOTO", v.getFoto());

        return dados;
    }

    //RECUPERAR TODOS OS PRODUTOS SALVOS
    public List<Vans> listVans() {

        String sql = "SELECT * FROM VANS;";
        List<Vans> list = new ArrayList<>();

        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        while (cursor.moveToNext()) {
            String placa = cursor.getString(cursor.getColumnIndex("PLACA"));
            String Uf_placa = cursor.getString(cursor.getColumnIndex("UF_PLACA"));
            String responsavel = cursor.getString(cursor.getColumnIndex("RESPONSAVEL"));
            String  origem = cursor.getString(cursor.getColumnIndex("ORIGEM"));
            String destino = cursor.getString(cursor.getColumnIndex("DESTINO"));
            String percurso = cursor.getString(cursor.getColumnIndex("percurso"));
            String horario = cursor.getString(cursor.getColumnIndex("HORARIO"));
            String foto = cursor.getString(cursor.getColumnIndex("FOTO"));


            list.add(new Vans(placa, Uf_placa, responsavel, origem, destino, percurso, horario, foto));
        }

        //Encerrar e liberar o cursor
        cursor.close();
        db.close();

        return list;
    }


    public void apagarProduto(Vans v) {
        SQLiteDatabase db = getWritableDatabase();

        String[] params = { String.valueOf(v.getPlaca()) };
        db.delete("produto","PLACA=?", params);

        db.close();
    }
}