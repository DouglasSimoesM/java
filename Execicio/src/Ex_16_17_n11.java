import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n11 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int soma=0;

        System.out.println("Entre com um Numero inteiro");
        num1 = scan.nextInt();
        System.out.println("Entre com outro numero inteiro");
        num2 = scan.nextInt();
        if (num1 < num2){
            num1++;
            do {
                soma += num1;
                System.out.println(num1);
                num1++;
            }while (num1<num2);
        }else {
            num2++;
            do {
                soma += num2;
                System.out.println(num2);
                num2++;

            }while (num2 < num1);
        }
        System.out.println("Soma " +soma);
    }
}
