import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n27 {
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de temperatura:");
        double temperaturas = scan.nextDouble();
        double temp;
        double tempMenor=Double.MAX_VALUE;
        double tempMaior=Double.MIN_VALUE;
        double media;
        double soma = 0;
        for (int i=1; i <=temperaturas;i++){
            System.out.println("Entre com a temperatura "+i+": ");
            temp = scan.nextDouble();
            if (temp > tempMaior){
                System.out.println("Maior valor alterada ! ");
                tempMaior = temp;
            } if (temp < tempMenor){
                System.out.println("Menor valor alterada !");
                tempMenor= temp;
            }
            soma += temp;
        }
        media = soma/temperaturas;
        System.out.println("Menor temperatura: "+tempMenor);
        System.out.println("Maior temperatura: "+tempMaior);
        System.out.println("Média temperatura: "+media);
    }
}
