package Ex_27;

public class Lampada01 {
        String modelo;
        String tensao;
        int potencia;
        String cor;
        String tipoLuz;
        int garantiaMeses;
        String [] tipos;
        boolean tipoAbajur;

        boolean ligada;

        void ligar(){
                ligada = true;
        }
        void desligar(){
                ligada = false;
        }
        void mostrarEstado(){
                if (ligada ){
                        System.out.println("A lampada esta ligada !");
                } else {
                        System.out.println("A lampada esta desligada");
                }
        }
        void mudarEstadoLampada(){
                if (ligada){
                        desligar();
                } else {
                        ligar();
                }
        }
}
