import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma = 0;
        for(int i = 0;i<vetorA.length;i++){
            System.out.println("Entre com valor da posição "+i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i<vetorA.length;i++){
            if (vetorA[i]%2 == 0){
                soma += 1;
            }
        }
        System.out.println(soma);
    }
}
