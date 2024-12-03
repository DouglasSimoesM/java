import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int menor = Integer.MAX_VALUE;
        int posicaoMenor=0;
        int posicaoMaior=0;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a idade da posição "+(i)+":");
            vetorA[i] = scan.nextInt();
            if (vetorA[i]>maior){
                maior = vetorA[i];
                posicaoMaior=i;
            } if (vetorA[i]<menor){
                menor = vetorA[i];
                posicaoMenor = i;
            }
        }
        System.out.println("Maior valor = "+maior+"\nPosição "+posicaoMaior);
        System.out.println("\nMenor valor = "+menor+"\nPosição "+posicaoMenor);
    }
}
