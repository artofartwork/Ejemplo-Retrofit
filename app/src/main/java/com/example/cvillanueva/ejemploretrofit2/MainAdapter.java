package com.example.cvillanueva.ejemploretrofit2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cvillanueva on 26/01/2018.
 */

public class MainAdapter {

    private List<Result> list;
    private Context context;
    private View view;

    public MainAdapter(Context context, View view) {
        this.list = new ArrayList<>();
        // Probando el Commit & Push de VCS de Android
        this.context = context;
        this.view = view;
    }

    public void swap(List<Result> newList) {
        list.clear();
        list.addAll(newList);
    //    notifyDataSetChanged();

    }

   // @Override
  //  public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     //   return new PokemonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_pokemon_item, parent, false));
//    }


}