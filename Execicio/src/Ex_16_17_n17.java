import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n17 {
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero");
        int num = scan.nextInt();
        System.out.print(num +" ! = ");
        int fatorial = 1;
        for (int i = num;i > 0; i--){
            fatorial *=i;
            System.out.print(i+".");
        }
        System.out.println("\nResultado "+fatorial);
    }
}
