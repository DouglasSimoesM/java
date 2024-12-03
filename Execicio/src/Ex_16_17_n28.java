import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n28 {
    public static void main (String[] Args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Entre com um numero");
            int num = scan.nextInt();
            boolean primo = true;
            for (int i = 2; i < num; i++ ){
                if (num% i == 0){
                    System.out.println("Não é primo!");
                    primo= false;
                }
            }
            if (num == 1 ){
                System.out.println("1 não é primo");
            } else if (primo){
                System.out.println(num + " é primo");
            }
    }
}
