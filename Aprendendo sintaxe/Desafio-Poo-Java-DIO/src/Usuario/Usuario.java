package Usuario;

import Iphone.Celular.Iphone;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Iphone iphone1 = new Iphone();


        iphone1.iniciarCorreioVoz();
        System.out.println("Digite um numero de telefone para ligar: ");
        String num = sc.next();
        iphone1.ligar(num);
        iphone1.atender();
        System.out.println(" ");

        System.out.println("Digite a url do site: ");
        String site = sc.next();
        iphone1.exibirPagina(site);
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();

        System.out.println(" ");

        System.out.println("Digite qual musica deseja ouvir: ");
        String musica = sc.next();
        iphone1.selecionarMusica(musica);
        iphone1.tocar();
        iphone1.pausar();

        sc.close();


    }
}
