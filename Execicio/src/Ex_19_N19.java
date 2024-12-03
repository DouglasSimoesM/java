import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_19_N19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] result = new double[notas1.length];
        for (int i = 0; i<notas1.length; i++){
            System.out.println("Entre com a nota posição "+(i+1)+": ");
            notas1[i] = scan.nextDouble();
            System.out.println("Entre com a nota posição "+(i+1)+": ");
            notas2[i] = scan.nextDouble();
        }
        for (int i = 0; i<result.length; i++){
            result[i] = (notas1[i]+notas2[i])/2;
        }
        for (int i = 0; i < notas1.length;i++){
            System.out.println("\nMédia aluno "+(i+1)+": "+result[i]);
            if (result[i]>=7){
                System.out.print(" (Aprovado)");
            }else {
                System.out.print(" (Reprovado)");
            }
        }
    }
}
