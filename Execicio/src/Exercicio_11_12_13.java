import java.util.Scanner;
//EXERCICIOS 11 - 12 - 13
public class Exercicio_11_12_13 {
    public static void main(String[] args) {
        //Exercicio 2 e 3
        Scanner scan = new Scanner(System.in);
//        System.out.println("Digite o primeiro numero:");
//        int numero1 = scan.nextInt();
//        System.out.println("Voce digitou o numero: " + numero1);
//        System.out.println("Digite o segundo numero:");
//        int numero2 = scan.nextInt();
//        int soma = numero1 +numero2;
//        System.out.println("A soma dos valores digitados é " + soma);
//        //EX 4
//        System.out.println("digite a nota do primeiro, segundo, terceiro e quarto bimestre:1");
//        double nota1 = scan.nextDouble();
//        double nota2 = scan.nextDouble();
//        double nota3 = scan.nextDouble();
//        double nota4 = scan.nextDouble();
//        double media = (nota1+nota2+nota3+nota4)/4;
//        System.out.println("A media das suas notas é " + media);
//        //EX 5
//        System.out.println("Digite sua altura em métros:");
//        double metro = scan.nextDouble();
//        double centimetro = (metro)*100;
//        System.out.println("Sua altura em centimetros é " + centimetro+"cm");
//        //Ex 6
//        System.out.println("Entre com o raio do circulo:");
//        double raio = scan.nextDouble();
//        double area0 = Math.PI * Math.pow(raio,2);
//        System.out.println("A area do circulo é " + area0);
        //Ex 7
//        System.out.println("Digite o valor lateral do quadrado:");
//        double latQuadrado = scan.nextDouble();
//        double areaDQ = Math.pow(latQuadrado, 2);
//        System.out.println("O valor da are4a do quadrado é "+ (areaDQ));
//        System.out.println("O valor da area do quadrado X2 é "+ (areaDQ*2));
//        //Ex 8
//        System.out.println("Quanto voce ganha por hora? ");
//        double valorPorHora = scan.nextDouble();
//        System.out.println("Quantas horas voce trabalha por mês?");
//        double horasPorMes = scan.nextDouble();
//        double pagamento= valorPorHora*horasPorMes;
//        System.out.println("voce recebe por mês " + pagamento);
//        //Ex 9
//        System.out.println("Digite a temperatura em fahrenheit:");
//        double tempfahrenheit = scan.nextDouble();
//        double valorEmCelsius = (tempfahrenheit-32)/1.8;
//        System.out.println("Temperatura em Graus Celsius é " + valorEmCelsius);
//        //Ex10
//        System.out.println("Digite o valor em Graus Celsius:");
//        double tempCelcius = scan.nextDouble();
//        double valorEmFahrenheit = (1.8*tempCelcius)+32;
//        System.out.println("Valor em Fahrenheit é "+valorEmFahrenheit);
//        //Ex11
//        System.out.println("Digite 2 numero inteiros");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        System.out.println("Digite um numero Real");
//        double num3 = scan.nextDouble();
//        double perg1 = (num1*2)*(num2/2);
//        double perg2 = (num1*3)+num3;
//        double perg3 = Math.pow(num3,3);
//        System.out.println("Dobro do primeiro * metade do segundo\n "+perg1+"\n" +
//                "Triplo do numero 1 + o numero 3 \n" +perg2+"\nTerceiro elevado ao cubo é \n"
//                +perg3);
//        //Ex12
//        System.out.println("Qual sua altura?");
//        double altuPessoa = scan.nextDouble();
//        double pesoIdeal = (72.7*altuPessoa)-58;
//        System.out.println("Seu peso ideal é "+pesoIdeal);
//        //Ex13
//        System.out.println("Digite sua altura");
//        double alturaAmbos = scan.nextDouble();
//        System.out.println("Digite seu sexo P/ Masculino (M) P/ Feminino (F)");
//        String sexo = scan.next();
//        double pesoHomem = (72.7*alturaAmbos)-58;
//        double pesoMulher= (62.1*alturaAmbos)-44.7;
//        System.out.println("Qual seu peso atual?");
//        double pesoAtual = scan.nextDouble();
//        if (sexo.equals("M")){
//            System.out.println("voce esta pesando "+pesoAtual+"Seu peso ideal é " + pesoHomem);
//        }else{
//            System.out.println("voce esta pesando "+pesoAtual+"\nSeu peso ideal é " + pesoMulher);
//        }
        //Ex14
//        System.out.println("Qual peso do peixe? ");
//        double pesoDoPeixe = scan.nextDouble();
//        double excesso = pesoDoPeixe - 50;
//        double multa = excesso*4;
//
//        if (pesoDoPeixe>50){
//            System.out.println("Existe um excesso de peso de "+excesso+"Kg\n" +
//                    "O valor da multa é R$"+multa);
//        }else {
//            System.out.println("Não existe excesso");
//        }
//        //Ex15
//        System.out.println("Quanto voce ganha por hora? ");
//        double valorPHora = scan.nextDouble();
//        System.out.println("Quantas horas voce trabalha por mês?");
//        double horaPorMes = scan.nextDouble();
//        double salarioBruto= valorPHora*horaPorMes;
//        double inss = (salarioBruto*8)/100;
//        double ir = (salarioBruto*11)/100;
//        double sindicato = (salarioBruto*5)/100;
//        double totalDesconto = ir+inss+sindicato;
//        double salarioLiquido = salarioBruto-totalDesconto;
//
//        System.out.println("O salario bruto é R$" +salarioBruto);
//        System.out.println("INSS R$"+inss);
//        System.out.println("ir R$"+ir);
//        System.out.println("Sindicato R$" +sindicato);
//        System.out.println("Total de desconto R$" +totalDesconto);
//        System.out.println("O salario liquido é R$" +salarioLiquido);
        //Ex 16
//        System.out.println("Quantos metros quadrados da area a ser pintada ?");
//        double metrosQuadrados = scan.nextDouble();
//        double div3 = (metrosQuadrados/3);
//        double qntdadeDeTinta = (div3/18)*80;
//        System.out.println("Voce deve comprar "+div3+"L de tinta\n"+
//                "e isso vai ter o custo R$"+qntdadeDeTinta);
//        //Ex17
//        System.out.println("Qual tamanho da area a ser pintada ?");
//        double areaPint = scan.nextDouble();
//        double convertido = (areaPint/6);
//        double dezoito = (convertido/18)*80;
//        double tres600= (convertido/3.6)*25;
//        double terceiro;
//        int dezoito1= (int) Math.floor(convertido);
//        int tres2= (int) Math.floor(convertido);
//
//        if (convertido%18 == 0){
//            System.out.println(" O valor em galões de 18 litros é R$"+ dezoito + "\n" +
//                    "O valor em galões de 3,6 Litros é R$"+tres600);return;
//        } if (convertido%3.6 == 0){
//            System.out.println("O valor em galões de 3,6 Litros é R$"+tres600);return;
//        } if (convertido%18 != 0 || convertido%3.6 != 0 ){
//            if (convertido%18 > 1) {
//                terceiro = (dezoito1*80)+25;
//                System.out.println("Voce vai precisar de "+ convertido + " latas de 18L"+
//                        " com acrescimo de 1 lata de 3,6 litros somando o valor R$"+terceiro);return;
//            }else {
//                terceiro = (tres2*25)+25;
//                System.out.println("Voce vai precisar de "+ convertido +"Latas de 3,6L"+
//                        " com acrescimo de 1 lata de 3,6 litros somando o valor R$"+terceiro);return;
//            }
//        }
////        //18
//        System.out.println("Entre com tamanho do arquivo:");
//        double  tamArquivo = scan.nextDouble();
//        System.out.println("Entre com a velocidade da internet:");
//        double velocidadeInternet = scan.nextDouble();
//
//        double  tempo=tamArquivo/velocidadeInternet;
//        System.out.println("Tempo de download é "+tempo);
    }
}