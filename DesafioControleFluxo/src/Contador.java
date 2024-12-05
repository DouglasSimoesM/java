import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com parametro 1:");
        int parametro1 = scan.nextInt();
        System.out.println("Entre com parametro 2:");
        int parametro2 = scan.nextInt();
        try {
            contar(parametro1, parametro2);
        }catch (ParametroInvalidoException exception){
            System.out.println(exception.getMessage());
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametroInvalidoException{
        if (parametroUm <= parametroDois){
            throw new ParametroInvalidoException("O primeiro numero deve ser maior que o segundo!");
        }
        int contagem = parametroUm - parametroDois;
        //Imprimir numero 1 até contagem
        for (int i = 1; i <= contagem ; i++){
            System.out.println(i);
        }
    }
 }

