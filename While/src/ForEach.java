import java.sql.SQLOutput;
import java.util.Random;

/*
*/
public class ForEach {
    public static void main (String[] args){
        int [] notas = new int[10];
        Random random = new Random();
        for (int i = 0 ; i < notas.length;i++){
            notas [i] = random.nextInt(10);
        }
        for (int i =0; i < notas.length;i++){
            System.out.println(notas[i]+" ");
        }
        System.out.println("USANDO FOR EACH");
        for (int nota : notas){
            System.out.print(nota+" ");
        }
        //Exemplo Matriz
        double[][] notasAlunos= new double[3][3];
        notasAlunos[0][0] = 5;
        notasAlunos[0][1] = 5;
        notasAlunos[0][2] = 5;

        notasAlunos[1][0] = 6;
        notasAlunos[1][1] = 6;
        notasAlunos[1][2] = 6;

        notasAlunos[2][0] = 7;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 7;
        System.out.println("");
        for(double [] notasAluno : notasAlunos){
            System.out.println(" ");
            for (double alunos : notasAluno){
                System.out.print(alunos+" ");
            }
        }
    }
}
