import java.util.Scanner;

public class Usuario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        SmartTv smartTv = new SmartTv();
        boolean statusTV = false;
        int botaoLigar;
        String botaoVolume;
        do {
            if (smartTv.ligada) {
                System.out.println("TV esta ligada");
                System.out.println("canal: " + smartTv.canal);
                System.out.println("Volume: " + smartTv.volume);
                System.out.println("\nPrecione 1 para desligar");
                botaoLigar = scan.nextInt();
                if (botaoLigar == 1){
                    System.out.println("Até mais");
                    return;
                }
            } else {
                System.out.println("Tv esta desligada");
                System.out.println("Precione 1 para ligar");
                botaoLigar = scan.nextInt();
                    if (botaoLigar == 1) {
                        smartTv.ligar();
                        statusTV = true;
                    } else {
                        System.out.println("Até mais");
                        return;
                    }
                }
            do {
                System.out.println("Precione 'm' p/ aumentar, 'd' p/ abaixar e 's' para sair");
                botaoVolume = scan.next();
                if (botaoVolume.equalsIgnoreCase("m")) {
                    smartTv.aumentaVolume();
                    System.out.println("Volume atual "+smartTv.volume);
                } else if (botaoVolume.equalsIgnoreCase("d")) {
                    smartTv.diminuirVolume();
                    System.out.println("Volume atual "+smartTv.volume);
                }
            }while (!botaoVolume.equalsIgnoreCase("s"));
            smartTv.mudarCanal();
            System.out.println("Canal atual: " + smartTv.canal);
        }while (statusTV);

    }
}
