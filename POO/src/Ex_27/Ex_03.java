package Ex_27;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Aluno03 aluno = new Aluno03();
        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com nome do curso");
        aluno.nomeCurso = scan.next();
        System.out.println("Entre com matricula:");
        aluno.matricula = scan.next();
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com a disciplina "+(i+1));
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i =0; i<aluno.notasDisciplinas.length; i++){
            System.out.println("Entre com a nota da disciplina "+aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++ ){
                System.out.println("Entre com a nota " +(j+1));
                aluno.notasDisciplinas[i][j]= scan.nextDouble();
            }
        }
        aluno.mostrarInfo();

        for (int i=0; i<aluno.nomeDisciplinas.length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina "+ aluno.nomeDisciplinas[i]+" - foi aprovado");
            }else{
                System.out.println("Disciplina "+ aluno.nomeDisciplinas[i]+" - foi reprovado");
            }
        }
    }
}