import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N34 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        String outputPar="";
        for (int i = 0; i < vetorA.length;i++){
            System.out.println("Entre com valor da posição "+i);
            vetorA[i]= scan.nextInt();
            if(vetorA[i]%2 ==0){
                outputPar += "\n Numeros par: "+vetorA[i];
            }
        }
        System.out.printf(outputPar);

    }
}
