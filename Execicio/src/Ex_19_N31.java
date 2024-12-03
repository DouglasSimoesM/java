import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA= new int[20];
        int[] vetorB= new int[vetorA.length];
        int par = 0;
        int impar = (vetorA.length-1) ;
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com valor de A posição "+i);
            vetorA[i]= scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i]%2 ==0){
                vetorB[par] = vetorA[i];
                par++;
            }else if (vetorA[i]%2 != 0){
                vetorB[impar] = vetorA[i];
                impar--;
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
