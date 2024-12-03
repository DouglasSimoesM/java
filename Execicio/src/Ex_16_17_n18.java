import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n18 {
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);

        int num;
        int soma=0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < 5 ;i++){
            System.out.println("Entre com um numero");
            num = scan.nextInt();
            soma += num;
            if (num > maior){
                maior=num;
                System.out.println("Maior numero foi atualizado");
            } else if (num < menor){
                menor=num;
                System.out.println("Menor numero foi atualizado");
            }
        }
        System.out.println("Soma: "+soma);
        System.out.println("Menor: "+menor);
        System.out.println("Maior: "+maior);
    }
}
