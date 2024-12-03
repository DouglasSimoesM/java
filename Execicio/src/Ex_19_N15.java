import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int par = 0;
        int somaPar=0;
        int impar = 0;
        int somaImpar=0;

        for (int i = 0 ; i< vetorA.length;i++){
            System.out.println("Entre com a posição "+(i+1)+": ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i]%2 ==0){
                par += vetorA[i];
                somaPar++;
            }else {
                impar += vetorA[i];
                somaImpar++;
            }
        }
        System.out.println("Numeros par: "+somaPar+"\nNumeros impar: "+somaImpar);
        System.out.println("Par: "+((somaPar*100)/vetorA.length)+"%");
        System.out.println("Impar: "+((somaImpar*100)/vetorA.length)+"%");
    }
}
