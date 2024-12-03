package Ex_27;

import ExerciciosPOO.ContaCorrenteEx05;

public class Ex_02 {
    public static void main(String[] args){
        ContaCorrente02 conta = new ContaCorrente02();

        conta.numConta = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10.0;
        conta.valorEspecialUsado = 0;

        System.out.println("Saldo: "+conta.numConta+" = "+conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(500);
        if (saqueEfetuado){
            System.out.println("saque efetuado com sucesso");
            conta.consutalSaldo();
        } else {
            System.out.println("Não foi possivel efetuar saque");
            conta.consutalSaldo();
        }
        conta.depositar(9);
        conta.consutalSaldo();
        if (conta.verificarUsoEspecial()){
            System.out.println("Esta usando cheque especial");
        } else{
            System.out.println("Não esta usando cheque especial");
        }
    }
}
