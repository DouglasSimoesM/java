import java.util.Scanner;
/*
    @autor Douglas Simões
 */
public class Ex_16_17_n22 {
    public static void main (String [] Args){
        Scanner scan = new Scanner(System.in);
        int alunos;
        double media;
        int turmas;
        int soma =0;

        System.out.println("Quantidade de turmas:");
        turmas= scan.nextInt();

        for (int i = 0; i<turmas;i++) {
            do {
                System.out.println("Entre com a quantidade de alunos da turma " + (i + 1));
                alunos = scan.nextInt();
                if (alunos > 40) {
                    System.out.println("O numero de alunos deve ser inferior a 40, tente novamente.");
                }
            } while (alunos > 40);
            soma+=alunos;
        }
        media=soma/turmas;
        System.out.println("Média: "+media);
    }
}
