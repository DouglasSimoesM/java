package papeis;

public class NavegadorInternet extends Iphone {
    private void validarConexao(){
        boolean valida = true;
        if (valida){
            System.out.println("Validando conexao");
        } else {
            System.out.println("Conexão perdida");
        }
    }
    public void pesquisar(){
        validarConexao();
        System.out.println("Pesquisando");
    }
    public void exibirPagina(){
        System.out.println("Exibindo Pagina");
    }
    public void atualizarPagina(){
        validarConexao();
        System.out.println("Atualizando pagina");
    }
}
