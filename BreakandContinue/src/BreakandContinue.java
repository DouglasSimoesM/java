import java.util.Scanner;

/*
    Autor Douglas Simões
 */
public class BreakandContinue {
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int num = scan.nextInt();
        System.out.println("Entre com um limite");
        int max = scan.nextInt();
        for (int i = num;i <= max; i++){
            if (i%7 == 0 ){
                continue;
            }
            System.out.println("Valor de i é "+i);
        }

    }
}
