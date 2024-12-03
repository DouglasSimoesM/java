import java.util.Scanner;
/*
    @autor Douglas Simões
 */
// todos numero primos entre um valor e outro.
public class Ex_16_17_n29 {
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero");
        int num = scan.nextInt();
        boolean pri = true;
        for (int i = 1; i <=num; i++){
            pri = true;
            for (int j = 2; j<i; j++){
                if (i % j ==0 ){
                    pri=false;
                }
            }
            if (pri){
                System.out.println(i);
            }
        }
    }
}
