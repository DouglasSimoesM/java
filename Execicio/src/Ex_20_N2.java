import java.util.Random;
import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_20_N2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizAleatorio = new int[10][10];
        Random numAleatorio = new Random();
        for (int i = 0; i < matrizAleatorio.length; i++){
            for (int j = 0; j <matrizAleatorio[i].length;j++){
                matrizAleatorio[i][j] = numAleatorio.nextInt(100);
            }
        }
        for (int i = 0; i < matrizAleatorio.length; i++){
            System.out.println("");
            for (int j = 0; j < matrizAleatorio[i].length; j++){
                System.out.print(matrizAleatorio[i][j]+" | ");
            }
        }
        int maiorL5 = 0;
        int menorL5=Integer.MAX_VALUE;
            for (int i = 0; i< matrizAleatorio[5].length;i++){
                if (matrizAleatorio[5][i] > maiorL5){
                    maiorL5 = matrizAleatorio[5][i];
                } if ( matrizAleatorio[5][i] < menorL5){
                    menorL5 = matrizAleatorio[5][i];
                }
        }
        System.out.println("\nMaior valor da linha 5: "+maiorL5);
        System.out.println("Menor valor da linha 5: "+menorL5);

        int maiorC7 = 0;
        int menorC7=Integer.MAX_VALUE;
        int col7=7;
        for (int i =0; i < matrizAleatorio.length;i++){
            if (matrizAleatorio[i][7]> maiorC7){
                maiorC7 = matrizAleatorio[i][7];
            }
            if (matrizAleatorio[i][7] < menorC7){
                menorC7 = matrizAleatorio[i][7];
            }
        }
        System.out.println("Maior valor da coluna 7: "+ maiorC7);
        System.out.println("Menor valor da coluna 7: "+ menorC7);
    }
}
