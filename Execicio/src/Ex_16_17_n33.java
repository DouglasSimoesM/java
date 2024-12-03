import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n33 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero:");
        int valorFinal = scan.nextInt();
        System.out.print("S = ");
        double soma = 0;
        for (int i =1, j=1; i <= valorFinal;i++, j+=2){
            System.out.print(i+"/"+j+" + ");
            soma += i/j;
            }
        System.out.println("Resultado: "+soma);

    }
}
