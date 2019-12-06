package com.example.aravans;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListaRotasActivity extends AppCompatActivity{

    private AdapterVans adapter;
    private Vans vans;
    private VansBD vansBD = new VansBD(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_rotas);



    //CRIA O ADAPTER PERSONALIZADO
        adapter = new AdapterVans(vansBD.listarVans(), this);

        //RECUPERA A LISTVIEW E ADD O ADAPTER
        ListView listView = findViewById(R.id.listview_rotas);
        listView.setAdapter(adapter);

        //Registar Menu de contexto para listview
        registerForContextMenu(listView);

        //CONFIGURA A ACAO DO BOTAO
        FloatingActionButton fbutton = findViewById(R.id.fab_lista_rotas);
        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaRotasActivity.this, CadastroVan.class);
                startActivity(intent);
            }
        });
    }

    //CRIAR CONTEXT MENU
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_item, menu);
    }


    //ACAO DO CLICK PARA O CONTEXT MENU
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        //RECUPERAR O ITEM DA LISTVIEW CLICADA
        AdapterView.AdapterContextMenuInfo contextMenuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        vans = (Vans) adapter.getItem(contextMenuInfo.position);

        //VERIFICAR QUAL ITEM DO CONTEXT MENU FOI CLICADO
        //OPCAO EDITAR
        if (item.getItemId() == R.id.menu_editar) {
            //CRIA A INTENT, ADD O PRODUTO E INICIA A ACITIVITY
            Intent i = new Intent(ListaRotasActivity.this, CadastroVan.class);
            i.putExtra("vans", vans);
            startActivity(i);
        }

        //OPCAO APAGA
        if (item.getItemId() == R.id.menu_apagar) {
            //INICIA O BD, CHAMA O METODO APAGAR E ATUALIZA O ADAPTER CHAMANDO O ONRESUME
            VansBD vansBD = new VansBD(this);
            vansBD.deletar(vans);
            onResume();
        }
        return super.onContextItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.atualiza(vansBD.listarVans());
    }
}
