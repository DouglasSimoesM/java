import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n16 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int primeiro=1;
        int segundo=1;
        int proximo;
        System.out.println(primeiro);
        System.out.println(segundo);
        for (int i = 3; i < 500; i++){
            proximo=primeiro+segundo;
            primeiro=segundo;
            segundo=proximo;
            System.out.println(proximo);
            i=proximo;
        }
    }
}
