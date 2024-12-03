package ExerciciosPOO;

public class Ex06 {
    public static void main(String[] args){
        ContatoEx06 contato1 = new ContatoEx06();

        contato1.nome = "Joao";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao.jj@gmail.com";
        contato1.telefone = new String[2];
        contato1.telefone[0] = "(15)99871-2209";
        contato1.telefone[1] = "(15)99862-9235";

        System.out.println(contato1.nome+" telefone: "+ contato1.telefone[0]);
    }
}
