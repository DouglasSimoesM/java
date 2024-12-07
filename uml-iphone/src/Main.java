import papeis.AparelhoTelefonico;
import papeis.Iphone;
import papeis.NavegadorInternet;
import papeis.ReproducaoMusical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        ReproducaoMusical reproducaoMusical = new ReproducaoMusical();
        NavegadorInternet navegadorInternet = new NavegadorInternet();


        aparelhoTelefonico.ligar();
        navegadorInternet.pesquisar();
        reproducaoMusical.tocar();
        aparelhoTelefonico.desligar();
    }
}