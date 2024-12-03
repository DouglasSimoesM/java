import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N30 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int posB= 0;
        int posC= 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com valor de A posição "+i);
            vetorA[i]= scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i]%2 ==0){
                vetorB[posB] = vetorA[i];
                posB++;
            }if (vetorA[i]%2 != 0){
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }
        System.out.print("\n Vetor A = ");
        for (int i = 0 ; i < vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.print("\n Vetor B = ");
        for (int i = 0 ; i < posB;i++){
            System.out.print(vetorB[i]+" ");
        }
        System.out.print("\n Vetor C = ");
        for (int i = 0 ; i < posC;i++){
            System.out.print(vetorC[i]+" ");
        }
    }
}
