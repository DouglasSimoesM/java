import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n21 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pesquisa feita com quantas pessoas ?");
        int pessoas = scan.nextInt();
        int idade;
        int soma=0;
        int media;
        for (int i =1; i<=pessoas;i++){
            System.out.println("Entre com idade da pessoa "+i);
            idade = scan.nextInt();
            soma += idade;
        }
        media = soma/pessoas;
        if (media >= 0 && media <= 25){
            System.out.println("Jovem");
        } if (media > 25 && media < 60){
            System.out.println("Adulto");
        } if (media >=60){
            System.out.println("Idosa");
        }
    }
}
