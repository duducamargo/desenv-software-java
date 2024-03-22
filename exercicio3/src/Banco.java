public class Banco {
    public String nome;
    public float conta =0.0f;
    public int numConta;

    Banco(String nome, int numConta, float conta, boolean logado) {
        this.nome = nome;
        this.conta = conta;
        this.numConta = numConta;
    }

    public Banco() {

    }

}
