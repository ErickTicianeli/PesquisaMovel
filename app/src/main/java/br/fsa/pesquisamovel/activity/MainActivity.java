package br.fsa.pesquisamovel.activity;

import android.os.Bundle;
import android.util.Log;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import br.fsa.pesquisamovel.R;

public class MainActivity extends AppCompatActivity {

    /**
     * Opções de configuração para métodos {NavigationUI}
     * que interagem com implementações do padrão de barra de aplicativos, como {androidx.appcompat.widget.Toolbar},
     * {com.google.android.material.appbar.CollapsingToolbarLayout} e {androidx.appcompat.app.ActionBar}.
     */
    private AppBarConfiguration mAppBarConfiguration;

    /**
     *Ciclo de vida da Activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "Iniciado onCreate");

        setContentView(R.layout.activity_main);

        /**
         * Uma barra de ferramentas padrão para uso no conteúdo do aplicativo.
         */
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * DrawerLayout atua como um contêiner de nível superior para o conteúdo da janela que permite que
         * visualizações de "gaveta" interativas sejam puxadas de uma ou de ambas as bordas verticais da janela.
         */
        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        /**
         * Representa um menu de navegação padrão para o aplicativo. O conteúdo do menu pode ser preenchido por um arquivo de recurso de menu.
         * NavigationView é normalmente colocado dentro de um DrawerLayout
         */
        NavigationView navigationView = findViewById(R.id.nav_view);

        /**
         * A classe Builder cria novas instâncias de {AppBarConfiguration}.
         * Crie um conjunto específico de destinos top level pelos Ids.
         */
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();

        /**
         * O NavController gerencia a navegação do aplicativo em um NavHost
         * NavHost está sendo requisitado pelo nav_host_fragment
         * Os aplicativos geralmente obterão um controlador diretamente de um host ou usando
         * um dos métodos de utilitário na classe Navigation em vez de criar um controlador diretamente.
         */
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        /**
         * Botão que acessa a navegação no menu superior
         */
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);

        /**
         * Configura a navegação para que o controlador funcione
         */
        NavigationUI.setupWithNavController(navigationView, navController);

    }
    /*
     *Ciclo de vida da Activity
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "Iniciado onStart");

    }
    /*
     *Ciclo de vida da Activity
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "Iniciado onResume");
    }
    /*
     *Ciclo de vida da Activity
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "Iniciado onPause");
    }
    /*
     *Ciclo de vida da Activity
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "Iniciado onStop");
    }
    /*
     *Ciclo de vida da Activity
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "Iniciado onDestroy");
    }



    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}