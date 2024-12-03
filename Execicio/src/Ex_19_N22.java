import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int cont0=0;
        int cont1=0;
        for (int i =0; i<vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random()*1);
        }
        for (int i = 0; i<vetorA.length; i++){
            if (vetorA[i] == 0){
                cont0++;
            }if (vetorA[i] ==1){
                cont1++;
            }
        }
        System.out.println("Numeros 0 = "+cont0);
        System.out.println("Média = "+(cont0*100)/vetorA.length);
        System.out.println("Numeros 1 = "+cont1);
        System.out.println("Média = "+(cont1*100)/vetorA.length);
    }
}
