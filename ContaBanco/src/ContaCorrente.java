import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean validar = false;
        int validaNumeroConta = 0;
        String validaNomeCliente = "";

        ContaTerminal conta = new ContaTerminal();

        conta.inserirValores();

        System.out.println("Consultar conta:");
        while (!validar){
            System.out.println("Entre com numero da Conta:");
            validaNumeroConta = scan.nextInt();

            System.out.println("Entre com Nome do cliente");
            validaNomeCliente = scan.next();

            if (validaNumeroConta == conta.numeroConta && validaNomeCliente.equalsIgnoreCase(conta.nomeCliente)){
                conta.imprimirMsgm();
                validar = true;
            } else {
                System.out.println("Numero da conta inexistente");
            }
        }

    }
}
