package Iphone.Celular;

import Iphone.Aplicativos.NavegadorInternet;
import Iphone.Aplicativos.ReprodutorMusica;
import Iphone.Aplicativos.Telefone;

public class Iphone implements NavegadorInternet, ReprodutorMusica, Telefone {
        //Telefone
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Alo?");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz tocando");
    }
        //Reprodutor de Musica
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("A musica selecionada foi: " + musica);
    }

    public void tocar() {
        System.out.println("Tocando a musica");
    }
        //navegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Abrindo o site: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba do navegador adiocionada");
    }
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}