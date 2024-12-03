import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n24 {
    public static void main (String [] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com valor do pão");
        double precoPao= scan.nextDouble();
        System.out.println("Preço do pão: "+precoPao);
        System.out.println("Panificadora Pão de Ontem - Tabela de preço:");
        for (int i =1; i<=50;i++){
            System.out.println(i+" - "+precoPao*i);
        }
    }
}
