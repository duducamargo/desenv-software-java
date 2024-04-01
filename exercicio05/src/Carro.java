public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public double velocidade;
    public int id;

    public void frear(double velocidade) {
        this.velocidade = velocidade - 30.0;
        if(this.velocidade < 0) {
            this.velocidade = 0;
        }
    }

    public void acelerar(double velocidade) {
        this.velocidade = velocidade + 30.0;
    }


    Carro(String marca, String modelo, int ano, double velocidade, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.id = id;
    }

    public Carro(){

    }


}
