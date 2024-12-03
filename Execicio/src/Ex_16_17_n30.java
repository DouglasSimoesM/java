import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n30 {
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);
        int taboada, inicio=-1, termino= 11;
        do {
        System.out.println("Qual taboada deseja?");
        taboada = scan.nextInt();
        System.out.println("Começar por: ");
        inicio = scan.nextInt();
        System.out.println("Terminar em: ");
        termino = scan.nextInt();
        if (inicio >termino){
            System.out.println("O valor de inicio deve ser menor que o de termino");
        }
        }while (inicio > termino);


        System.out.println("Montar taboada do: "+taboada);
        System.out.println("Começar por: "+inicio);
        System.out.println("Terminar em: "+termino);
        if (inicio<termino){
            for (int i = inicio; i <= termino;i++){
                System.out.println(taboada+" x "+i+" = "+i*taboada);
            }
        }else{
            System.out.println("Valor inicio deve ser maior que final !!!");
        }
    }
}
