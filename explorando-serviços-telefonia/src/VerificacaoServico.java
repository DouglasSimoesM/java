import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // TODO: Verifique se o serviço está na lista de serviços contratados
            if (servico.equalsIgnoreCase("movel") && partes[0].equalsIgnoreCase("Alice")
                    && partes[1].equalsIgnoreCase("movel") && partes[2].equalsIgnoreCase("fixa")){
                System.out.println("Sim");
            } else if (servico.equalsIgnoreCase("tv") && partes[0].equalsIgnoreCase("carol") && partes[1].equalsIgnoreCase("movel")
                    && partes[2].equalsIgnoreCase("fixa")){
                System.out.println("Sim");
            } else if (servico.equalsIgnoreCase("fixa") && partes[0].equalsIgnoreCase("bob") && partes[1].equalsIgnoreCase("movel")
                    && partes[2].equalsIgnoreCase("tv")){
                System.out.println("Nao");
            } else {
                System.out.println("Valores fornecidos invalido tente novamente");
            }


        scanner.close();
    }
}