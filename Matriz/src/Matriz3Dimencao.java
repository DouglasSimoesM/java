import java.util.Scanner;

/*
    @Autor
    Douglas Simões
*/
public class Matriz3Dimencao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int [][][] matrizTridimensional = new int[3][3][3];

        for (int i = 0; i <matrizTridimensional.length; i++){
            for (int j = 0; j <matrizTridimensional[i].length; j++){
                for (int k = 0; k <matrizTridimensional[i][j].length;k++){
                    System.out.println("i = "+i+" j = "+j+" k = "+k  );
                    matrizTridimensional[i][j][k] = i+j+k;
                }
            }
        }
        int soma = 0;
        int somaPar = 0;
        int somaImpar = 0;
        for (int i = 0; i <matrizTridimensional.length; i++){
            for (int j = 0; j <matrizTridimensional[i].length; j++){
                for (int k = 0; k <matrizTridimensional[i][j].length;k++){
                    soma += matrizTridimensional[i][j][k];

                    if (matrizTridimensional[i][j][k]%2 ==0){
                        somaPar += matrizTridimensional[i][j][k];
                    } else if (matrizTridimensional[i][j][k]%2 !=0) {
                        somaImpar += matrizTridimensional[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma total: "+soma);
        System.out.println("Soma dos Pares: "+somaPar);
        System.out.println("Somas dos impar: "+somaImpar);
    }
}
