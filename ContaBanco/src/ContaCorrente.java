import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            boolean validar = false;
            int validaNumeroConta = 0;
            String validaNomeCliente = "";

            ContaTerminal conta = new ContaTerminal();

            conta.inserirValores();

            System.out.println("Consultar conta:");
            while (!validar) {
                System.out.println("Entre com numero da Conta:");
                validaNumeroConta = scan.nextInt();

                System.out.println("Entre com Nome do cliente");
                validaNomeCliente = scan.next();

                if (validaNumeroConta == conta.numeroConta && validaNomeCliente.equalsIgnoreCase(conta.nomeCliente)) {
                    conta.imprimirMsgm();
                    validar = true;
                } else {
                    System.out.println("Numero da conta inexistente");
                }
            }

        }catch (InputMismatchException e){
            System.out.println("Os campos numero da conta e saldo devem ser preenchidos com valores numéricos" +
                    " \nEx: conta: 123 saldo: 10,22");
        }
    }
}
