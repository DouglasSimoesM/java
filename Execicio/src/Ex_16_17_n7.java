import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;

        for (int i =0; i<5; i++){
            System.out.println("Entre com um Numero:");
            num = scan.nextInt();
            if (num > maior){
                maior = num;
                System.out.println("O numero maior mudou "+maior);
            }
        }
        System.out.println("O maior numero digitado foi: "+maior);
    }
}
