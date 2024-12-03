import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N32 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com valor da posição "+i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Taboado do "+vetorA[i]+":");
            for (int j = 1; j <=10; j++){
                System.out.println(vetorA[i]+" X "+j+" = "+(vetorA[i]*j));
            }
        }
    }
}
