import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n5 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int popInicioA, popInicioB;
        double taxaCrescimentoA, taxaCrescimentoB;
        boolean seVerdadeiro= false;
        int cont=0;
        do {
            seVerdadeiro=false;
            System.out.println("Digite o numero de habitantes A:");
            popInicioA= scan.nextInt();
            System.out.println("Digite taxa de crescimento por ano A:");
            taxaCrescimentoA = scan.nextDouble();
            if (popInicioA < 0 || taxaCrescimentoA < 0){
                seVerdadeiro=true;
                System.out.println("O numero de habitantes e a Taxa de crescimento deve ser > 0");
            }
        } while (seVerdadeiro == true);
        do {
            seVerdadeiro = false;
            System.out.println("Digite o numero da população B");
            popInicioB = scan.nextInt();
            System.out.println("Digite a taxa de crecimento por ano B:");
            taxaCrescimentoB = scan.nextDouble();
            if (popInicioB < 0 || taxaCrescimentoB <0){
                seVerdadeiro=true;
                System.out.println("O numero de habitantes e a Taxa de crescimento deve ser > 0");
            }
        } while (seVerdadeiro == true);
        if (taxaCrescimentoA > taxaCrescimentoB){
            while (popInicioA <= popInicioB){
                popInicioA += (popInicioA/100)*taxaCrescimentoA;
                popInicioB += (popInicioB/100)*taxaCrescimentoB;
                cont++;
            }
            System.out.println("População A: "+popInicioA);
            System.out.println("População B: "+popInicioB);
            System.out.println("População A ira Utrapassar População B em "+cont+" anos");
        } else {
            while (popInicioB <= popInicioA){
                popInicioA += (popInicioA/100)*taxaCrescimentoA;
                popInicioB += (popInicioB/100)*taxaCrescimentoB;
                cont++;
            }
            System.out.println("População A: "+popInicioA);
            System.out.println("População B: "+popInicioB);
            System.out.println("População B ira Utrapassar População A em "+cont+" anos");
        }
    }
}
