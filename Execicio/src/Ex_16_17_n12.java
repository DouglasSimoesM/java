import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n12 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Entre com numero:");
        num = scan.nextInt();
        for (int i = 0;i <= 10; i++){
                System.out.println(num+" X "+i+" = "+num*i );
            }
        }
    }

