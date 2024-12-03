package ExerciciosPOO;

import java.util.Date;

public class Ex04 {
    public static void main(String[] args){
        LivroBibliotecaEx04 livrobiblioteca = new LivroBibliotecaEx04();

        livrobiblioteca.nome = "Matering ex";
        livrobiblioteca.autor = "Loiane";
        livrobiblioteca.anoLancamento = 2015;

        livrobiblioteca.emprestimo = true;
        livrobiblioteca.dataEntrega = new Date();
        livrobiblioteca.emprestadoAo = "Loiane";

    }
}
