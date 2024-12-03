import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        for (int i = 0; i<vetorA.length;i++){
            System.out.println("Entre com valores PAR:");
            vetorA[i]= scan.nextInt();
            if (vetorA[i]%2 != 0){
                System.out.println("O numero informado é impar '"+vetorA[i]+"'");
                break;
            }
        }
    }
}
