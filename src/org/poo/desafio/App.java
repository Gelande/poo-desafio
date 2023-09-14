package org.poo.desafio;

public class App {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        //Reprodutor musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica(3);

        //Aparelho telefônico
        iphone.ligar(99998888);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Navegador
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
