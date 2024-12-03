import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_19_N1 {
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA= new int[5];
        int[] vetorB= new int[vetorA.length];
        for(int i = 0; i<vetorA.length;i++){
            System.out.println("Entre com valor "+(i+1)+":");
            vetorA[i] = scan.nextInt();
            vetorB[i]= vetorA[i];
        }
        for (int i = 0; i<vetorA.length; i++){
            System.out.println("Vetor A Posição "+(i+1)+" "+vetorA[i]);
        }
        for (int i = 0; i<vetorB.length; i++){
            System.out.println("Vetor B Posição "+(i+1)+" "+vetorB[i]);
        }
    }
}
