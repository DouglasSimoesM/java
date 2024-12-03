import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N36 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[11];

        for (int i = 0; i < vetorA.length;i++){
            vetorA[i]= Math.pow(2, i);
        }
        System.out.print("\n Vetor A = ");
        for (int i = 0 ; i < vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
    }
}
