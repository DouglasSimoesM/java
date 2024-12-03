import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n23 {
    public static void main (String[] Args){
//        Scanner scan = new Scanner(System.in);
        double preço = 1.99;
        System.out.println("* Lojas quase dois - Tabela de preços:");
        for (int i =1; i<=50; i++){
            System.out.println("* "+i+" - R$"+preço*i);
        }

    }
}
