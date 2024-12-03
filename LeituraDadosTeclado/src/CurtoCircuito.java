public class CurtoCircuito {
    public static void main(String[] args){
        boolean verdadeiro = true;
        boolean falso = false;

        boolean resultado1 = falso && verdadeiro;

        boolean resultado2 = falso & verdadeiro;

        System.out.println(resultado1);
        System.out.println(resultado1);
        //Curto circuito é qaundo usamos os && para que se no primeiro valor ja tivermos
        //o resultado entao ele n vai para segunda variavel.
        // é feito quando estamos debugando o programa
    }
}
