import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N26 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a posição "+i+ " do vetor A:");
            vetorA[i]= scan.nextInt();
            System.out.println("Entre com a posição "+i+ " do vetor B:");
            vetorB[i]= scan.nextInt();
        }
        for (int i =0; i < vetorC.length; i++){
            if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }if (vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            } else if (vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }
        }
        System.out.print("Vetor A = ");
        for (int i = 0 ; i<vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println("");
        System.out.print("Vetor B = ");
        for (int i = 0 ; i<vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }
        System.out.println("");
        System.out.print("Vetor C = ");
        for (int i = 0 ; i < vetorC.length; i++){
            System.out.print(vetorC[i]+" ");
        }
    }
}
