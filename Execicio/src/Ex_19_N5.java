import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N5 {
    public static void main(String[] Args){
        Scanner scan= new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i<vetorA.length;i++){
            System.out.println("Entre com posição "+(i+1)+": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i]*i;
        }
        System.out.print("Vetor A = ");
        for (int i = 0; i<vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.print("\nVetor B = ");
        for (int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }
    }
}