import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N37 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com valor da posição "+i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            vetorB[i]=1;
            for (int j = 1; j <= vetorA[i]; j++){
                vetorB[i] *= j;
            }
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
