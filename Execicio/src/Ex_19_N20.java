import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Entre com a cotação do dolar:");
        cotacao = scan.nextDouble();
        for (int i=0; i<vetorA.length;i++){
            vetorA[i]=cotacao*(i+1);
        }
        System.out.print("\nVetor A = ");
        for (int i = 0; i <vetorA.length;i++){
            System.out.print(vetorA[i]+" ");
        }

    }
}
