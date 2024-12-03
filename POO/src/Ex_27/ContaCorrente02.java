package Ex_27;

public class ContaCorrente02 {
    String numConta;
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar){
        if (saldo >= quantiaASacar){
            saldo -=quantiaASacar;
            return true;
        }else {// não tem saldo na conta
            if (especial){//verificar se o limite tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;//não tem saldo e não é especial
            }
        }
    }
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    void consutalSaldo(){
        System.out.println("Saldo: "+saldo);
    }
    boolean verificarUsoEspecial(){
        return saldo < 0;
    }
}
