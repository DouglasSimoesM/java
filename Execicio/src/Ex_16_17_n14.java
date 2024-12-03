import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n14 {
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);
        int num;
        int pares = 0;
        int impar = 0;
        for(int i = 0; i<10;i++){
            System.out.println("Entre com um numero:");
            num= scan.nextInt();

            if (num% 2 == 0){
                pares++;
            } else{
                impar++;
            }
        }
        System.out.println("Numeros pares: "+pares);
        System.out.println("Numeros impar: "+impar);

    }
}
