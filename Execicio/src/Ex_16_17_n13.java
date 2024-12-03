import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n13 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com numero base:");
        int base = scan.nextInt();
        System.out.println("Entre com numero expoente");
        int expoente = scan.nextInt();
        int num=base;
        int resultado=0;
        for (int i =1; i < expoente; i++){
            resultado = num*base;
            num = resultado;
        }
        System.out.println(resultado);
    }
}
