package Animais;
//Atributos

public class Cachorro extends Animal{
    static int numeroDeCachorros;
    private int tamanhoDoRabo;


//Contrutores

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDoEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDoEspirito = estadoDoEspirito;

        numeroDeCachorros ++;
    }

    //Métodos

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDoEspirito() {
        return estadoDoEspirito;
    }

    public void setEstadoDoEspirito(String estadoDoEspirito) {
        this.estadoDoEspirito = estadoDoEspirito;
    }

    public String pegar(){
        return "Bolinha";}

    public String interagir (String acao){
        switch (acao){
            case "carinho" : this.estadoDoEspirito = "Feliz";break;
            case "vai dormir" : this.estadoDoEspirito = "Bravo";break;
            case "pisar na patinha" : this.estadoDoEspirito = "Triste";break;
            default: this.estadoDoEspirito="Neutro";break;
        }
        return this.estadoDoEspirito;
        }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU!!!");
    }
}
