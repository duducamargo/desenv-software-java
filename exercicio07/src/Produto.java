public class Produto {
    public String nome;
    public int id;
    public int quant;
    public double preco;

    Produto(String nome, int id, int quant, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quant = quant;
    }

    public Produto(){

    }
}
