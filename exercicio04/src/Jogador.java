public class Jogador {
    public int id;
    public String nome;
    public float pontuacao;
    public int nivel;
    
    Jogador(String nome, int nivel, float pontuacao, int id)  {
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
        this.id = id;
    }

    public Jogador(){

    }
    
}