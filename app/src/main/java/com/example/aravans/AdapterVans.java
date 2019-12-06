package com.example.aravans;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterVans extends BaseAdapter {

    private List<Vans> listaVans;
    private Context context;

    public AdapterVans(List<Vans> listaVans, Context context) {
        this.listaVans = listaVans;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaVans.size();
    }

    @Override
    public Vans getItem(int position) {
        return listaVans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Inflar a view item

        View view = LayoutInflater.from(context).inflate(R.layout.item_vans, parent, false);

        //Recuperar a Van
        Vans v = listaVans.get(position);

        //Recuperar as views

        TextView tvOrigem = view.findViewById(R.id.item_origem);
        TextView tvDestino = view.findViewById(R.id.item_destino);
        TextView tvHorario = view.findViewById(R.id.item_origem);

        //Adicionar na view
        tvOrigem.setText(v.getOrigem());
        tvDestino.setText(v.getDestino());
        tvHorario.setText(v.getHorario());

        return view;
    }

    public void atualiza(List<Vans> vans) {
        listaVans.clear();
        listaVans.addAll(vans);
        notifyDataSetChanged();
    }

    public void remove(Vans vans) {
        listaVans.remove(vans);
        //notifyDataSetChanged();
    }

}
