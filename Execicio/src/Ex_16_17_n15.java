import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n15 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o n-ésimo termo da sério fiboonacci:");
        int n = scan.nextInt();
        int primeiro=1;
        int segundo=1;
        int proximo;
        System.out.println(primeiro);
        System.out.println(segundo);
        for (int i = 3; i <= n; i++){
            proximo=primeiro+segundo;
            primeiro=segundo;
            segundo=proximo;
            System.out.println(proximo);
        }
    }
}
