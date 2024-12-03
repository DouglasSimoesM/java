import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n20 {
    public static void main (String [] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a quantidade de notas");
        int notas = scan.nextInt();

        double nota;
        double soma = 0 ;
        double media;
        for (int i = 1; i <= notas; i++){
            System.out.println("Entre com a nota "+i);
            nota = scan.nextDouble();
            soma += nota;
        }
        media= soma/notas;
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+media);
    }
}
