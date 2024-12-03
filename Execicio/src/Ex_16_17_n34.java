import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n34 {
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com valor de N");
        int n = scan.nextInt();
        double soma=0;
        for (int i = 1; i <=n; i++){
            soma += 1/i;
            System.out.print(1+"/"+i+" + ");
        }
        System.out.println("Soma: "+ soma  );
    }
}
