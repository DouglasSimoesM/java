import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_14_15 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        //Ex1
      /*  System.out.println("Entre com 1 numero");
        int num1 = scan.nextInt();
        System.out.println("Entre com o segundo numero");
        int num2 = scan.nextInt();
        if (num1 > num2){
            System.out.println("O numero "+num1+" é maior que " +num2);return;
        }if (num2>num1){
            System.out.println("O numero "+num2+" é maior que " +num1);return;
        }else {
            System.out.println("O numero "+num1+" é igual ao numero " +num2);
        }*/
        //Ex 2
     /*   System.out.println("Digite um valor");
        double valor= scan.nextDouble();
        if (valor >= 0){
            System.out.println("Numero POSITIVO");
        }else{
            System.out.println("Numero Negativo");
        }*/
        //Ex 3
        /*System.out.println("Digite seu sexo sendo (M) masculino e (F) feminino");
        String sexo = scan.next();
        if (sexo.equalsIgnoreCase("M")){
            System.out.println("Sexo masculino");return;
        } if (sexo.equalsIgnoreCase("F")){
            System.out.println("Sexo feminino");return;
        } else{
            System.out.println("Sexo invalido");
        }*/
        //Ex 4
        /*System.out.println("Digite uma letra");
        String letra = scan.next();
        switch (letra){
            case "a" :
            case "e" :
            case "i" :
            case "o" :
            case "u" :
            case "A" :
            case "E" :
            case "I" :
            case "O" :
            case "U" : System.out.println("Vogal");break;
               }*/
        //Ex5
        /*System.out.println("Entre com primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com segunda nota:");
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;
        if (media >= 7 && media <10){
            System.out.println("Aprovado");
        } if (media <7){
            System.out.println("Reprovado");
        } if (media == 10){
            System.out.println("Aprovado com Distinção");
        }*/
        //Ex 6
       /* System.out.println("Entre com 1 numero");
        double nume1 = scan.nextDouble();
        System.out.println("Entre com 1 numero");
        double nume2 = scan.nextDouble();
        System.out.println("Entre com 1 numero");
        double nume3 = scan.nextDouble();

        if (nume1 > nume2 && nume1 >nume3){
            System.out.println("O maior numero é "+nume1);return;
        } if (nume2 > nume1 && nume2 >nume3){
            System.out.println("O maior numero é " + nume2);return;
        } else {
            System.out.println("O maior numero é "+ nume3);
        }*/
        //Ex 7
       /* System.out.println("Entre com 1 numero");
        double num1 = scan.nextDouble();
        System.out.println("Entre com 1 numero");
        double num2 = scan.nextDouble();
        System.out.println("Entre com 1 numero");
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 >num3){
            System.out.println("O maior numero é "+num1);
        } if (num2 > num1 && num2 >num3){
            System.out.println("O maior numero é " + num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println("O maior numero é "+ num3);}

        if (num1 < num2 && num1 < num3){
            System.out.println("O menor numero é "+num1);
        }
        else if (num2 < num1 && num2 <num3){
            System.out.println("O menor numero é " + num2);
        }
        else if (num3<num1 && num3 <num2){
            System.out.println("O menor numero é "+ num3);}*/
        //Ex8
        /*System.out.println("Entre com valor do produto");
        double prod1 = scan.nextDouble();
        System.out.println("Entre com valor do produto");
        double prod2 = scan.nextDouble();
        System.out.println("Entre com valor do produto");
        double prod3 = scan.nextDouble();

        if (prod1 < prod2 && prod1 <prod3){
            System.out.println("Mais Barato é "+prod1);
        }if (prod2 < prod1 && prod2 < prod3){
            System.out.println("Mais Barato é "+prod2);
        }if(prod3 < prod1 && prod3 < prod2){
            System.out.println("Mais Barato é "+prod3);
        }*/
        //Ex9
       /* System.out.println("Entre com numero:");
        double num1 = scan.nextDouble();
        System.out.println("Entre com numero:");
        double num2 = scan.nextDouble();
        System.out.println("Entre com numero:");
        double num3 = scan.nextDouble();

        if (num1 < num2 && num1 < num3 && num2 < num3){
            System.out.println(num1+"\n"+num2+"\n"+num3);
            //num1 - num2 - num3
        }if (num1<num2 && num1<num3 && num3 <num2){
            System.out.println(num3+"\n"+num1+"\n"+num2);}
        //num1 - num3 - num2
        if (num2 < num1 && num2 <num3 && num1 <num3){
            System.out.println(num2+"\n"+num1+"\n"+num3);
            //num2 - num1 - num3
        }if(num2<num1 && num2<num3 && num3 <num1){
            System.out.println(num3+"\n"+num1+"\n"+num2);}
        //num2 - num3 - num1
        if (num3<num1 && num3<num2 && num1 <num2){
            System.out.println(num3+"\n"+num1+"\n"+num2);
            //num3 - num1 - num2
        }if (num3<num1 && num3<num2 && num2 <num1){
            System.out.println(num3+"\n"+num2+"\n"+num1);}
            //num3 - num2 - num1*/
        //Ex 10
        /*System.out.println("Qual turno voce estudao ? (M - Manã, V - Tarde e N - Noturno)");
        String turno = scan.next();
        switch (turno){
            case "M" : System.out.println("Bom dia !!!");break;
            case "V" : System.out.println("Boa tarde !!!");break;
            case "N" : System.out.println("Boa noite !!!");break;
            case "n" : System.out.println("Boa noite !!!");break;
            case "v" : System.out.println("Boa tarde !!!");break;
            case "m" : System.out.println("Bom dia !!!");break;
            default: System.out.println("Turno invalido");
        }*/
        //Ex 11
        /*System.out.println("Entre com seu salario:");
        double salario = scan.nextDouble();
        double reajuste;
        if (salario <= 280){
            System.out.println("Seu salario era R$"+ salario);
            System.out.println("Aumento de 20%");
            reajuste= (salario*20)/100;
            System.out.println("R$"+reajuste);
            salario=reajuste+salario;
            System.out.println("Seu salario agora é:"+salario);
        } else if (salario >280 && salario <= 700 ){
            System.out.println("Seu salario era R$"+ salario);
            System.out.println("Aumento de 15%");
            reajuste= (salario*15)/100;
            System.out.println("R$"+reajuste);
            salario=reajuste+salario;
            System.out.println("Seu salario agora é:"+salario);
        }else if (salario >700 && salario <=1500){
            System.out.println("Seu salario era R$"+ salario);
            System.out.println("Aumento de 10%");
            reajuste= (salario*10)/100;
            System.out.println("R$"+reajuste);
            salario=reajuste+salario;
            System.out.println("Seu salario agora é:"+salario);
        }else if (salario > 1500){
            System.out.println("Seu salario era R$"+ salario);
            System.out.println("Aumento de 5%");
            reajuste= (salario*5)/100;
            System.out.println("R$"+reajuste);
            salario=reajuste+salario;
            System.out.println("Seu salario agora é:"+salario);
        }*/
        //Ex 12
        System.out.println("Quanto recebe por hora ?");
        double salario = scan.nextDouble();
        System.out.println("Quantas horas trabalhadas diariamente?");
        double horasTrabalhada = scan.nextDouble();
        double salarioBruto = salario*horasTrabalhada;
        double ir;
        double inss = (salarioBruto*10)/100;
        double fgts = (salarioBruto*11)/100;
        double totalDesconto;
        double salarioLiquido;

        if (salarioBruto <= 900){
            System.out.println("Salario bruto: ("+horasTrabalhada+" * "+ salario+")     : R$"+salarioBruto);
            ir = 0;
            System.out.println("(-) IR (0%)                      : R$"+ir);
            System.out.println("(-) INSS (10%)                   : R$"+inss);
            System.out.println("FGTS (11%)                       : R$"+fgts);
            totalDesconto = inss+ir;
            System.out.println("Total de desconto                : R$"+ totalDesconto);
            salarioLiquido = salarioBruto-totalDesconto;
            System.out.println("Salário Liquido                  : R$"+salarioLiquido);
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            System.out.println("Salario bruto: ("+horasTrabalhada+" * "+ salario+")     : R$"+salarioBruto);
            ir = (salarioBruto*5)/100;
            System.out.println("(-) IR (5%)                      : R$"+ir);
            System.out.println("(-) INSS (10%)                   : R$"+inss);
            System.out.println("FGTS (11%)                       : R$"+fgts);
            totalDesconto = inss+ir;
            System.out.println("Total de desconto                : R$"+ totalDesconto);
            salarioLiquido = salarioBruto-totalDesconto;
            System.out.println("Salário Liquido                  : R$"+salarioLiquido);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            System.out.println("Salario bruto: ("+horasTrabalhada+" * "+ salario+")     : R$"+salarioBruto);
            ir = (salarioBruto*10)/100;
            System.out.println("(-) IR (10%)                      : R$"+ir);
            System.out.println("(-) INSS (10%)                    : R$"+inss);
            System.out.println("FGTS (11%)                        : R$"+fgts);
            totalDesconto = inss+ir;
            System.out.println("Total de desconto                 : R$"+ totalDesconto);
            salarioLiquido = salarioBruto-totalDesconto;
            System.out.println("Salário Liquido                   : R$"+salarioLiquido);
        } else if (salarioBruto > 2500 ){
            System.out.println("Salario bruto: ("+horasTrabalhada+" * "+ salario+")     : R$"+salarioBruto);
            ir = (salarioBruto*20)/100;
            System.out.println("(-) IR (20%)                      : R$"+ir);
            System.out.println("(-) INSS (10%)                    : R$"+inss);
            System.out.println("FGTS (11%)                        : R$"+fgts);
            totalDesconto = inss+ir;
            System.out.println("Total de desconto                 : R$"+ totalDesconto);
            salarioLiquido = salarioBruto-totalDesconto;
            System.out.println("Salário Liquido                   : R$"+salarioLiquido);}
        //Ex13
        /*System.out.println("Entre com numero de 1 a 7, 1 sendo domingo e etc:");
        int dia = scan.nextInt();
        switch (dia){
            case 1 : System.out.println("Domingo");break;
            case 2 : System.out.println("Segunda");break;
            case 3 : System.out.println("Terça");break;
            case 4 : System.out.println("Quarta");break;
            case 5 : System.out.println("Quinta");break;
            case 6 : System.out.println("Sexta");break;
            case 7 : System.out.println("Sabado");break;
            default: System.out.println("Valor invalido");
        }*/
        //Ex 14
        /*System.out.println("Entre com a primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota:");
        double nota2 = scan.nextDouble();
        double media = (nota2+nota1)/2;
        if (media >= 9){
            System.out.println("Primeira nota "+nota1+" Segunda nota "+nota2+
                    " Sua media foi "+media +", Conceito A\nAPROVADO");
        } else if (media < 9 && media >= 7.5){
            System.out.println("Primeira nota "+nota1+" Segunda nota "+nota2+
                    " Sua media foi "+media +", Conceito B\nAPROVADO");
        }else if (media < 7.5 && media >= 6){
            System.out.println("Primeira nota "+nota1+" Segunda nota "+nota2+
                    " Sua media foi "+media +", Conceito C\nAPROVADO");
        } else if (media < 6 && media >= 4){
            System.out.println("Primeira nota "+nota1+" Segunda nota "+nota2+
                    " Sua media foi "+media +", Conceito D\nREPROVADO");
        }else if (media <4){
            System.out.println("Primeira nota "+nota1+" Segunda nota "+nota2+
                    " Sua media foi "+media +", Conceito E\nREPROVADO");
        }*/
        //Ex 15
        /*System.out.println("Entre com valor do lado 1 do triangulo");
        double lado1= scan.nextDouble();
        System.out.println("Entre com valor do lado 2 do triangulo");
        double lado2 = scan.nextDouble();
        System.out.println("Entre com valor do lado 3 do triangulo");
        double lado3 = scan.nextDouble();
        double seVerdadeiro = lado1+lado2;

        if (seVerdadeiro < lado3){
            System.out.println("Não é possivel formar um triangulo com esses valores.");
        } else if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Triangulo equilátero: 3 lados igual");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("Triangulo isóceles: 2 lados iguais");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("Triangulo Escaleno: 3 lado diferentes");
        }*/
        //Ex 16
        //17
        /*System.out.println("Entre com um ano");
        int ano = scan.nextInt();
        int bissexto = ano%4;
        if (bissexto == 0 && bissexto%100 != 0){
            System.out.println(ano+" é bissexto");
        } else if (bissexto == 0 && bissexto%100 == 0 && bissexto%400 == 0){
            System.out.println(ano+" é bissexto");
        } else {
            System.out.println(ano + " Não é bissexto");
        }*/
        //Ex 18

    }
}
