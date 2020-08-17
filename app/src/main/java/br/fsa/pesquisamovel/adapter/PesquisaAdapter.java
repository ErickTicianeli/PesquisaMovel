package br.fsa.pesquisamovel.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.fsa.pesquisamovel.R;
import br.fsa.pesquisamovel.model.Pesquisa;

/**
 * Criado por Adriano Macedo Santana
 *
 * Classe responsável por fazer uma exibição para cada item em um conjunto de dados.
 * Faz a ponte entre os dados e a view
 */

public class PesquisaAdapter extends RecyclerView.Adapter<PesquisaAdapter.MyViewHolder> {

    List<Pesquisa> listaPesquisas;

    /**
     * Inner class para armazenar os atributos do RecyclerView
     */
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView titulo, alerta;

        public MyViewHolder(@NonNull View v) {
            super(v);

            titulo = v.findViewById(R.id.textTitulo);
            alerta = v.findViewById(R.id.textAlerta);

        }
    }

    public PesquisaAdapter(List<Pesquisa> lista) {

        this.listaPesquisas = lista;
    }

    /**
     * É chamado quando é necessário criar um novo item do RecyclerView
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public PesquisaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        /**
         * Converte o XML em objeto (infla o layout)
         */
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_pesquisa, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    /**
     * Define os atributos de exibição com base nos dados
     * É invocado quando um item precisa ser exibido para o usuário
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Pesquisa pesquisa = listaPesquisas.get(position);

        Log.d("PesquisaAdapter", String.valueOf(position));
        Log.d("PesquisaAdapter", pesquisa.toString());

        holder.titulo.setText(pesquisa.getTitulo());
        holder.alerta.setText(pesquisa.getValidade());
    }

    /**
     * Quantidade de elementos que serão exibidos no RecyclerView
     * @return
     */
    @Override
    public int getItemCount() {
        return listaPesquisas.size();
    }

}
