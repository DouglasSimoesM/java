import javax.sound.midi.Soundbank;
import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n2 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        boolean infValida = false;
        do {
            System.out.println("Entre com nome do usuario:");
            String usuario= scan.next();
            System.out.println("Entre com a senha");
            String senha = scan.next();
            if (usuario.equalsIgnoreCase(senha)){
                System.out.println("Nome do usuario igual senha. Digite novamente");
            } else {
                infValida = true;
                System.out.println("Usuario: " + usuario +"\n Senha: "+senha);
            }
        }while (infValida == false);

    }
}
