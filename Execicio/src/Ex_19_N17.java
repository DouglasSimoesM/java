import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int maior35=0;
        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Entre com a idade da pessoa "+(i+1)+":");
            vetorA[i]= scan.nextInt();
            if (vetorA[i]>35){
                maior35++;
            }
        }
        System.out.println("Acima de 35 anos: "+maior35);
        System.out.println("Inferior a 35 anos: "+(vetorA.length-maior35));
    }
}
