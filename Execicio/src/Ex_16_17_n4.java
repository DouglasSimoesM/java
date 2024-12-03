import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n4 {
    public static void main (String[] args){
        //Scanner scan = new Scanner(System.in);
        //A = 80000 Habt crescimento anual de 3%
        //B = 200000 habit crescimento anual 1,5%
        int popA= 80000;
        int popB=200000;
        int cont=0;

        while (popA <= popB){

            popA += (popA/100)*3;
            popB += (popB/100)*1.5;
           cont ++;
        }
        System.out.println("Populaçã A: "+popA + "\nPopulação B: "+popB);
        System.out.println(+cont+ " Anos");
    }
}
