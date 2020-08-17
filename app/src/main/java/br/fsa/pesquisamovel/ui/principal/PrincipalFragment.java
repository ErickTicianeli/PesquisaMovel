package br.fsa.pesquisamovel.ui.principal;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import br.fsa.pesquisamovel.R;
import br.fsa.pesquisamovel.adapter.PesquisaAdapter;
import br.fsa.pesquisamovel.model.Pesquisa;

public class PrincipalFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Pesquisa> listaPesquisa = new ArrayList<>();

    public PrincipalFragment() {
    }

    /**
     * Criado por Adriano Macedo
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     * Converte o XML e aproveita o contexto da View na activity atual para  configurar RecyclerView
     * retorna a View configurada
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_principal, container, false);
        this.recyclerViewConfig(root);

        return root;
    }

    /**
     * Configura RecyclerView
     * @param view
     */
    public void recyclerViewConfig(View view) {

        //Requisitando o uso do recyclerView
        recyclerView = view.findViewById(R.id.recyclerView);

        //Otimiza para tamanho fixo
        recyclerView.setHasFixedSize(true);

        //Define um tipo de layout para o recyclerView
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(), LinearLayout.VERTICAL));

        //Listagem de pesquisas
        this.criarPesquisas();

//        Log.d("PrincipalFragment",this.listaPesquisa.toString());

        //Configurar adapter
        mAdapter = new PesquisaAdapter(listaPesquisa);

        //Defini o adapdator para o recyclerView
        recyclerView.setAdapter(mAdapter);
    }

    /**
     * Alimentação das pesquisas
     */
    public void criarPesquisas() {

        Pesquisa pesquisa = new Pesquisa("Coronavírus", "Expira em 2021");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("Diabetes", "Expira em 2021");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("Cuidados Domésticos", "Expira em 2021");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("Uso de máscara", "Expira em 2021");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("Sintomas em quarentena", "Expira em 2021");
        this.listaPesquisa.add(pesquisa);
    }
}