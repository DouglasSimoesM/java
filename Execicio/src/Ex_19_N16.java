import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N16 {
    public static void main(String[] args){
        Scanner scar = new Scanner(System.in);
        int[] vetorA = new int[10];
        int menor15= 0;
        int iguais15 =0;
        int maior15=0;
        int contMaior15=0;
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a posição "+(i+1)+":");
            vetorA[i]= scar.nextInt();

            if (vetorA[i] < 15){
                menor15 += vetorA[i];
            } if (vetorA[i] == 15){
                iguais15++;
            } if (vetorA[i] > 15){
                maior15 += vetorA[i];
                contMaior15++;
            }
        }
        System.out.println("Somas valores inferior 15: "+menor15);
        System.out.println("Valores iguais a 15: "+iguais15);
        System.out.println("Média valores maior que 15: "+(maior15/contMaior15));
    }
}
