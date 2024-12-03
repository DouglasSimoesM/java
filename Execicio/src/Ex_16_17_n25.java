import java.util.Scanner;
/*
    @autor Douglas Simões
 */
//caixa
public class Ex_16_17_n25 {
    public static void main (String [] Args){
        Scanner scan = new Scanner(System.in);
        boolean sair = false;
        String continuarCompra;
        int produtos;
        double total;
        double preco;
        String output;
        double valorPago;
        double troco;
        do {
            System.out.println("Deseja contrinuar a compra ? S/N");
            continuarCompra = scan.next();
            if (continuarCompra.equalsIgnoreCase("S")){
                output = "Lojas Tabajara\n";
                System.out.println("Digite a quantidade de produtos: ");
                produtos = scan.nextInt();
                total = 0;
            for (int i = 1; i <= produtos;i++){
                System.out.println("Informe o preço do produto "+i+":");
                preco= scan.nextDouble();
                total+=preco;
                output += "Produto "+i+": R$"+preco+"\n";
            }
                output += "Total: "+ total+"\n";
                System.out.println("Total: "+total);
                System.out.println("Entre com valor pago: ");
                valorPago = scan.nextDouble();
                troco = valorPago - total;
                System.out.println("Troco: "+total);
                output+="Dinheiro: R$"+valorPago+"\n";
                output+= "Troco: R$"+troco;
                System.out.println(output);
            }else {
                sair = true;
            }
        }while (!sair);
    }
}