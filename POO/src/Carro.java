public class Carro {
    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consulmoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é " +capCombustivel*consulmoCombustivel+" Km");
    }
    double obterAutonomia(){
        System.out.println("foi chamado obterAutonomia! ");
        return capCombustivel * consulmoCombustivel;
    }
    double calcularCombustivel(double km){
        double qtdCombustivel = km/consulmoCombustivel;

        return qtdCombustivel;
    }

}
