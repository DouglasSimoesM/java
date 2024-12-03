package Animais;
//Atributos
public abstract class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected int tamanhoDoRabo;
    protected String estadoDoEspirito;
//Construtor
    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }
//Métodos
    protected void comer(){}
    protected void dormir(){}
    public abstract void soar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
