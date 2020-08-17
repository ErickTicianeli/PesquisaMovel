package br.fsa.pesquisamovel.model;

/**
 * Criado por Adriano Macedo Santana
 *
 * POJO da Pesquisa
 */

public class Pesquisa {

    private String titulo;
    private String validade;

    public Pesquisa() {
    }

    public Pesquisa(String titulo, String validade) {
        this.titulo = titulo;
        this.validade = validade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Pesquisa{" +
                "titulo='" + titulo + '\'' +
                ", validade='" + validade + '\'' +
                "}\n";
    }
}
