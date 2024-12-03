import java.util.Formattable;
import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N35 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length;i++){
            System.out.println("Entre com valor da posição "+i);
            vetorA[i]= scan.nextInt();
        }
        for (int i = 0; i < vetorA.length;i++){
            System.out.printf("\nAnalisando numero "+vetorA[i]+"\n");
            for (int j = 1; j <= vetorA[i];j++){
                if (vetorA[i]%j == 0){
                    System.out.println(vetorA[i]+" é dividido por: "+j);
                }
            }

        }
    }
}
