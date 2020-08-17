package br.fsa.pesquisamovel.model;

/**
 * Criado por Adriano Macedo Santana
 *
 * POJO da Pesquisa
 */

public class Pesquisa {

    private String data;
    private String titulo;
    private String validade;
    private String valor;

    public Pesquisa() {
    }

    public Pesquisa(String data, String titulo, String validade, String valor) {
        this.data = data;
        this.titulo = titulo;
        this.validade = validade;
        this.valor = valor;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pesquisa{" +
                "data='" + data + '\'' +
                ", titulo='" + titulo + '\'' +
                ", validade='" + validade + '\'' +
                ", valor='" + valor + '\'' +
                "}\n";
    }
}

