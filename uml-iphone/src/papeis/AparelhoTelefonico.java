package papeis;

import java.util.Scanner;

public class AparelhoTelefonico extends Iphone {

    public void ligar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com nome: ");
        nomeUsuario = scan.nextLine().trim();
        System.out.println("Aparelho ligado");
        System.out.println("Olá "+ nomeUsuario +"\nSeja bem vindo");
    }
    public void desligar (){
        System.out.println("Até logo " + nomeUsuario);
    }
    public void atender(){
        System.out.println("Ligação atendida");
    }
    public void finalizarLigacao(){
        System.out.println("Ligação desligada");
    }
    public void exibirMenssagem(){
        System.out.println("Exibindo menssagem");
    }
    public void respondendoMenssagem(){
        System.out.println("Respondendo menssagem");
    }

}
