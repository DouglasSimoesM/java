import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N28 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com valor da posição "+i);
            vetorA[i] = scan.nextInt();
            vetorB[vetorB.length-i-1] = vetorA[i];
        }
        System.out.print("\n Vetor A = ");
        for (int i = 0 ; i < vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.print("\n Vetor B = ");
        for (int i = 0 ; i < vetorB.length;i++){
            System.out.print(vetorB[i]+" ");
        }
    }
}
