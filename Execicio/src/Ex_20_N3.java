import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_20_N3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrizTeclado = new int[3][3];
        int par = 0;
        int impar = 0;
        for (int i = 0; i < matrizTeclado.length; i++){
            for (int j = 0; j < matrizTeclado[i].length; j++){
                System.out.println("Entre com a linha " +j+" da colona "+ i);
                matrizTeclado[i][j] = scan.nextInt();
                if (matrizTeclado[i][j]%2 == 0 ){
                    par++;
                }
                if (matrizTeclado[i][j]%2 != 0){
                    impar++;
                }
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < matrizTeclado.length;i++){
            System.out.println("");
            for (int j = 0; j < matrizTeclado[i].length; j++){
                System.out.print(matrizTeclado[i][j]+" | ");
            }
        }
        System.out.println("\nNumeros par: "+ par);
        System.out.println("Numeros impar: "+ impar);
    }
}
