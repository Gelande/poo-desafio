package org.poo.desafio;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    private int numeroMusica;
    private long numeroTelefone;

    public int getNumeroMusica() {
        return numeroMusica;
    }

    public void setNumeroMusica(int numeroMusica) {
        this.numeroMusica = numeroMusica;
    }

    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void ligar(long numeroTelefone) {
        System.out.println("Ligando para o número " + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atender.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música em pausa.");
    }

    @Override
    public void selecionarMusica(int numeroMusica) {
        System.out.println("Música " + numeroMusica + " selecionada." );
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "numeroMusica=" + numeroMusica +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
