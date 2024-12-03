import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N13 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com valor da posição "+(i+1));
            vetorA[i] = scan.nextInt();
            if (vetorA[i]%5 == 0 ){
                soma+=vetorA[i];
            }
        }
        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println("\nSoma: "+soma);
    }
}
