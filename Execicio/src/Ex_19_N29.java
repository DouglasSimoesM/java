import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N29 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length*2];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com valor vetor A da posição "+i);
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];
            System.out.println("Entre com valor vetor B da posição "+i);
            vetorB[i] = scan.nextInt();
            vetorC[vetorB.length+i] = vetorB[i];
        }
        System.out.print("\n Vetor A = ");
        for (int i = 0 ; i < vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.print("\n Vetor B = ");
        for (int i = 0 ; i < vetorB.length;i++){
            System.out.print(vetorB[i]+" ");
        }
        System.out.print("\n Vetor C = ");
        for (int i = 0 ; i < vetorC.length;i++){
            System.out.print(vetorC[i]+" ");
        }
    }
}
