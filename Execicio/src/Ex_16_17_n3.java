import java.awt.event.WindowFocusListener;
import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n3 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        boolean infValida = false;
        String nome;
        do {
            infValida= false;
            System.out.println("Entre com seu nome:");
            nome = scan.next();
            if (nome.length() <=3){
                infValida = true;
                System.out.println("Nome invalido!");
            }
        } while (infValida == true);
        int idade;
        do {
            infValida = false;
            System.out.println("Entre com sua idade:");
            idade = scan.nextInt();
           if (idade < 0 || idade > 150){
               infValida = true;
               System.out.println("Idade invalida");
           }
        }while (infValida == true);
        double salario;
        do {
            infValida = false;
            System.out.println("Entre com seu salario:");
            salario= scan.nextDouble();
            if (salario < 0){
                infValida= true;
                System.out.println("Salario deve ser > 0");
            }
        }while (infValida == true);
        String sexo;
        do {
            infValida=false;
            System.out.println("Entre com sexo, 'F' ou 'M' ");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")){
            } else {
                infValida = true;
                System.out.println("Valor de sexo invalido");
            }
        }while (infValida == true);
        String estCivil;
        do {
            infValida = false;
            System.out.println("Entre com Esta civil 's' 'c' 'd' 'v'");
            estCivil=scan.next();
            if (estCivil.equalsIgnoreCase("s")||estCivil.equalsIgnoreCase("c")||
                    estCivil.equalsIgnoreCase("d")|| estCivil.equalsIgnoreCase("v")){
            } else {
                infValida= true;
                System.out.println("Estado civil invalido!");
            }
        }while (infValida==true);
        System.out.println("Valores digitados:");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salario: R$" +salario);
        System.out.println("Sexo: "+sexo);
        System.out.println("Estado Civil: "+estCivil);
    }
}