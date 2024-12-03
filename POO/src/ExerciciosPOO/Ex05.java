package ExerciciosPOO;

public class Ex05 {
    public static void main(String [ ] args){
        ContaCorrenteEx05 conta = new ContaCorrenteEx05();

        conta.numConta = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = 10.0;

        System.out.println("Saldo: "+conta.numConta+" = "+conta.saldo);
    }
}
