import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N25 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0 ; i < vetorA.length; i++){
            System.out.println("Entre com a posição "+i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;//se sim recebe 1 se não 0
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
    }
}
