import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Digite sua nota de 0 a 10");
            nota = scan.nextInt();
        }while (nota > 10 || nota < 0 );
        System.out.println("Sua nota é "+nota);
    }
}
