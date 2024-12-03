import java.text.DecimalFormat;
import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_19_N4 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA= new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i =0; i< vetorA.length; i++){
            System.out.println("Entre com posição "+(i+1)+": ");
            vetorA[i]= scan.nextInt();
            vetorB[i] =Math.sqrt(vetorA[i]);
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.print("\nVetor B = ");
        for (int i = 0; i<vetorB.length; i++){
            System.out.print(df.format(vetorB[i])+" ");
        }
    }
}
