import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma = 0;
        int impar = 0;
        for (int i = 0;i<vetorA.length;i++){
            System.out.println("Entre com valor da posição "+(i+1));
            vetorA[i]=scan.nextInt();
            if (vetorA[i]%2 != 0 ){
                soma += vetorA[i];
                impar++;
            }
        }
        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        System.out.println("Soma: "+soma);
        System.out.println("Impar: "+impar);
        System.out.println("Média dos numeros impar: "+(soma/impar));
    }
}
