import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;

import java.util.Scanner;

public class ComputadorUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ServicoMensagemInstantanea smi = null;

        System.out.println("Entre com aplicativo de mensagem, Facebook, MSN ou Telegram");
        String appEscolhido = scan.next().trim();
        if (appEscolhido.equalsIgnoreCase("Facebook")){
            smi = new FacebookMessenger();
        } else if (appEscolhido.equalsIgnoreCase("MSN")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equalsIgnoreCase("Telegram")){
            smi = new TelegramMessenger();
        } else {
            System.out.println("Aplicativo invalido");
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
