/*
    @Autor Douglas Simões
*/
public class TesteCarro {
    public static void main(String[] args){
        Carro van = new Carro();
        van.marca = "fiat";
        van.modelo = "Ducato";
        van.numPassageiro = 10;
        van.capCombustivel = 100;
        van.consulmoCombustivel = 0.2;
        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiro = 4;
        fusca.capCombustivel = 30;
        fusca.consulmoCombustivel = 0.15;
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("Autonimia do carro é "+autonomia);
        System.out.println("Autonimia do carro é "+van.obterAutonomia());

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);
        System.out.println("qtdCombustivel10 = "+qtdCombustivel10);
        System.out.println("qtdCombustivel15 = "+qtdCombustivel15);
    }
}
