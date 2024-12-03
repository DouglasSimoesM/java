import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_20_N1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] numerosAleatorios= new int[4][4];
        Random numeroRandom = new Random();
        for (int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j< numerosAleatorios[i].length;j++){
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maior = 0;
        int menor = 0;
        int linhaMa = 0;
        int linhaMe = 0;
        int colMa = 0;
        int colMe =0;
        for (int i = 0; i <numerosAleatorios.length;i++){
            for (int j = 0; j <numerosAleatorios[i].length;j++){
                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linhaMa = i;
                    colMa = j;
                } else if(numerosAleatorios[i][j] < linhaMe){
                    menor = numerosAleatorios[i][j];
                    linhaMe = i;
                    colMe = j;
                }
            }
        }
        for (int i = 0; i <numerosAleatorios.length;i++){
            System.out.println("");
            for (int j = 0; j <numerosAleatorios[i].length;j++){
                System.out.print(numerosAleatorios[i][j]+" | ");
            }
        }
        System.out.println("\nMaior valor = "+maior);
        System.out.println("Linha = "+linhaMa);
        System.out.println("Coluna = "+colMa);
        System.out.println("\nMenor valor = "+menor);
        System.out.println("Linha = "+linhaMa);
        System.out.println("Coluna = "+colMa);
    }
}
