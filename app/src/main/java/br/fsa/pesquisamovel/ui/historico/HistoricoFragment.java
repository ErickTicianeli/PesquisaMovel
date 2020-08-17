package br.fsa.pesquisamovel.ui.historico;

import android.os.Bundle;
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
import br.fsa.pesquisamovel.adapter.HistoricoAdapter;
import br.fsa.pesquisamovel.model.Pesquisa;

/**
 * Criado por Adriano Macedo
 */
public class HistoricoFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Pesquisa> listaPesquisa = new ArrayList<>();

    public HistoricoFragment() {
    }

    /**
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     * Converte o XML e aproveita o contexto da View na activity atual para  configurar RecyclerView
     * retorna a View configurada
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_historico, container, false);
        this.recyclerViewConfig(root);

        return root;
    }

    /**
     * Configura RecyclerView
     * @param view
     */
    public void recyclerViewConfig(View view) {

        //Requisitando o uso do recyclerView
        recyclerView = view.findViewById(R.id.recyclerHistorico);

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
        mAdapter = new HistoricoAdapter(listaPesquisa);

        //Defini o adapdator para o recyclerView
        recyclerView.setAdapter(mAdapter);
    }

    /**
     * Alimentação das pesquisas
     */
    public void criarPesquisas() {

        Pesquisa pesquisa = new Pesquisa("6 de agosto de 2020","Coronavírus", "Expira em 2021","+ R$0,83");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("3 de agosto de 2020","Diabetes", "Expira em 2021","+ R$0,32");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("19 de julho de 2020","Cuidados Domésticos", "Expira em 2021","+ R$0,39");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("13 de julho de 2020","Uso de máscara", "Expira em 2021","+ R$0,72");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("6 de julho de 2020","Sintomas em quarentena", "Expira em 2021","+ R$0,60");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("30 de junho de 2020","Sintomas em quarentena", "Expira em 2021","+ R$1,91");
        this.listaPesquisa.add(pesquisa);

        pesquisa = new Pesquisa("24 de junho de 2020","Sintomas em quarentena", "Expira em 2021","+ R$1,18");
        this.listaPesquisa.add(pesquisa);
    }

}