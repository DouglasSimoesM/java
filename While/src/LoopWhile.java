public class LoopWhile {
    public static void main (String[] args){
        int i = 0;
        int max= 10;
        System.out.println("Contar até "+max);
        while (i <= max){
            System.out.println("Valor de i "+i);
            i++;
        }
        System.out.println("O valor de i é "+i);
        do {
            i++;
            System.out.println("Valor de i: " +i);
        } while (i<15);
        System.out.println("Valor de i é "+i);
    }

}