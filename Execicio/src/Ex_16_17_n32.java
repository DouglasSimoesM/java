import java.text.DecimalFormat;
import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n32 {
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);
        boolean naoTerminar = true;
        int codigo, qnt;
        double total = 0;
        String output= "";
        do {
            System.out.println("Digite o código e a quantidade. Digite 0 0 para sair.");
            codigo = scan.nextInt();
            qnt = scan.nextInt();
            if (codigo == 0 && qnt == 0){
                naoTerminar =false;
            } else {
                if ( codigo == 100){
                    output+="Cachorro quente -> R$ 1,20 * " + qnt;
                    output+= " = "+ (1.20*qnt+"\n");
                    total += 1.20*qnt;
                } else if ( codigo == 101){
                    output += "Bauru simples -> 1,30 * "+ qnt;
                    output+= " = "+ (1.30*qnt+"\n");
                    total += 1.30*qnt;
                } else if (codigo == 102){
                    output += "Bauru com ovo -> 1,50 * "+ qnt;
                    output+= " = "+ (1.50*qnt+"\n");
                    total += 1.50*qnt;
                }else if (codigo == 103){
                    output += "Hamburguer -> 1,20 * "+ qnt;
                    output+= " = "+ (1.20*qnt+"\n");
                    total += 1.20*qnt;
                }else if (codigo == 104){
                    output += "Cheeseburguer -> 1,30 * "+ qnt;
                    output+= " = "+ (1.30*qnt+"\n");
                    total += 1.30*qnt;
                } else if (codigo == 105){
                    output += "Refrigerante -> 1,00 * "+ qnt;
                    output+= " = "+ (1.00*qnt+"\n");
                    total += 1.00*qnt;
                }

            }
        }while (naoTerminar);
        System.out.println(output);
        System.out.println("Total: "+total);
    }
}
