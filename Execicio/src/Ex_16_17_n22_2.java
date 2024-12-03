import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n22_2 {
    public static void main (String[] Args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Entre com total de CD's");
        int totalCds= scan.nextInt();
        double valorPago;
        double totalInvestido=0;
        double media;
        for (int i = 1; i <= totalCds; i++){
            System.out.println("Valor pago no CD "+i);
            valorPago = scan.nextDouble();
            totalInvestido+=valorPago;
        }
        media = totalInvestido/totalCds;
        System.out.println("Total investido: "+totalInvestido);
        System.out.println("Media: "+media);

    }
}
