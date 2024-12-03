package ExerciciosPOO;

public class Exer01 {
    public static void main(String[] args){

        Lampadas lampada = new Lampadas();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amaralo";
        lampada.tipoLuz = "Amaralo";
        lampada.tipos = new String[2];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
        System.out.println(lampada.tipos[0]+"\n"+lampada.tipos[1]);

    }
}
