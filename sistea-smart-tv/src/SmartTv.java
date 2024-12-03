import java.util.Scanner;

public class SmartTv {
    Scanner scan = new Scanner(System.in);
    boolean ligada = false;
    int canal = 1;
    int volume = 99;
    int novoCanal = 0;
    boolean canalVerdadeiro = false;


    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentaVolume(){
        if (volume < 100){
            volume++;
        } else{
            System.out.println("Volume Maximo");
        }
    }
    public void diminuirVolume(){
        if (volume > 0 ){
            volume--;
        } else{
            System.out.println("Volume minimo");
        }
    }
    public void mudarCanal(){
        canalVerdadeiro = false;
        while (!canalVerdadeiro){
            System.out.println("Entre com canal");
            novoCanal = scan.nextInt();
            if (novoCanal > 0 && novoCanal <= 100){
                canal = novoCanal;
                canalVerdadeiro = true;
            } else {
                System.out.println("Esse canal não existe");
            }
        }
    }
}


