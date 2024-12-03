import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_16_17_n8 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double num;
        double soma=0;
        double media;
        for (int i =0;i<5; i++){
            System.out.println("Digite um numero:");
            num = scan.nextDouble();
            soma += num;
        }
        media = soma/5;
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+media);
    }
}
