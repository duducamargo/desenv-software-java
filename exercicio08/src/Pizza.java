import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public List<String> nomes = new ArrayList<>();
    public double valor;
    public int id;
    public String endereco;

    public Pizza(List<String> nomes, double valor, int id, String endereco) {
        this.nomes = nomes;
        this.valor = valor;
        this.id = id;
        this.endereco = endereco;
    }

    public Pizza() {
        
    }
}
