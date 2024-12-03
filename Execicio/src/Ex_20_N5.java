import java.util.Scanner;

/*
    @autor Douglas Simões
 */
public class Ex_20_N5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String [][][] comprimossos = new String[12][31][9];
        boolean sair = false;
        boolean mesValido= false;
        boolean diaValido = false;
        boolean horaValido = false;
        int opcao;
        int mes= 0;
        int dia=0;
        int hora=0;
        while (!sair) {
            System.out.println("Digite 1 para add compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair. ");
            opcao = scan.nextInt();
            diaValido = false;
            horaValido = false;
            mesValido = false;
            if (opcao == 1) { //add compromisso
                while (!mesValido) {
                    System.out.println("Entre com mes:");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente");
                    }
                }
                while (!diaValido) {
                    System.out.println("Entre com dia do mes:");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }
                while (!horaValido) {
                    System.out.println("Entre com a hora:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }
                System.out.println("Digite o compromisso:");
                comprimossos[--mes][--dia][hora] = scan.next();
            } else if (opcao == 2) {// consultar compromisso
                while (!mesValido) {
                    System.out.println("Entre com mes:");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente");
                    }
                }
                while (!diaValido) {
                    System.out.println("Entre com dia do mes:");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }
                while (!horaValido) {
                    horaValido = false;
                    System.out.println("Entre com a hora:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }
                System.out.println("O compromisso é: \n" + comprimossos[--mes][--dia][hora]);
            }else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção invalida !");
            }
        }
    }

}



