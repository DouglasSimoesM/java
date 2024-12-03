import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_20_N4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String [][] comprimossos = new String[31][24];
        boolean sair = false;
        boolean diaValido = false;
        boolean horaValido = false;
        int opcao;
        int dia=0;
        int hora=0;
        while (!sair) {
            System.out.println("Digite 1 para add compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair. ");
            opcao = scan.nextInt();
            diaValido=false;
            horaValido=false;
            if (opcao == 1){ //add compromisso
                while (!diaValido){
                    System.out.println("Entre com dia do mes:");
                    dia = scan.nextInt();
                    if (dia >0 && dia <= 31) {
                        diaValido = true;
                    }else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }
                while (!horaValido){
                    System.out.println("Entre com a hora:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValido = true;
                    }else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }
                System.out.println("Digite o compromisso:");
                comprimossos[--dia][hora]= scan.next();
            } else if (opcao == 2){// consultar compromisso
                diaValido=false;
                horaValido=false;
                while (!diaValido){

                    System.out.println("Entre com dia do mes:");
                    dia = scan.nextInt();
                    if (dia >0 && dia <= 31) {
                        diaValido = true;
                    }else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }
                while (!horaValido) {
                    horaValido=false;
                    System.out.println("Entre com a hora:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }

                System.out.println("O compromisso é: \n"+comprimossos[--dia][hora]);

            } if (opcao == 0) {
                sair = true;
            }else{
                System.out.println("Opção invalida !");
            }
        }
    }
}
