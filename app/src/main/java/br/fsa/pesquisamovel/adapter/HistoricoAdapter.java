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
public class HistoricoAdapter extends RecyclerView.Adapter<HistoricoAdapter.MyViewHolder> {

    List<Pesquisa> listaPesquisas;

    /**
     * Inner class para armazenar os atributos do RecyclerView
     */
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView data, valor, titulo;

        public MyViewHolder(@NonNull View v) {
            super(v);

            data = v.findViewById(R.id.textData);
            valor = v.findViewById(R.id.textValor);
            titulo = v.findViewById(R.id.textTitulo2);

        }
    }

    public HistoricoAdapter(List<Pesquisa> lista) {

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
    public HistoricoAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        /**
         * Converte o XML em objeto (infla o layout)
         */
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_historico, parent, false);

        HistoricoAdapter.MyViewHolder vh = new HistoricoAdapter.MyViewHolder(v);
        return vh;
    }

    /**
     * Define os atributos de exibição com base nos dados
     * É invocado quando um item precisa ser exibido para o usuário
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull HistoricoAdapter.MyViewHolder holder, int position) {

        Pesquisa pesquisa = listaPesquisas.get(position);

        Log.d("HistoricoAdapter", String.valueOf(position));
        Log.d("HistoricoAdapter", pesquisa.toString());

        holder.data.setText(pesquisa.getData());
        holder.valor.setText(pesquisa.getValor());
        holder.titulo.setText(pesquisa.getTitulo());
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
