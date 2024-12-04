import java.util.Scanner;

public class ContaTerminal {
    Scanner scan = new Scanner(System.in);
    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo;

    void inserirValores(){
        System.out.println("Qual seu nome ? ");
        nomeCliente = scan.next();
        System.out.println("Entre com numero da conta:");
        numeroConta = scan.nextInt();
        System.out.println("Entre com Agencia: ");
        agencia = scan.next();
        System.out.println("Entre com saldo atual:");
        saldo = scan.nextDouble();
    }
    void imprimirMsgm(){
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta " +
                "em nosso banco, sua agencia é "+agencia+", conta "+numeroConta+" e" +
                " seu saldo "+saldo+" ja está disponivel para saque.");
    }

}
