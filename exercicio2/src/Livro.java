public class Livro {
    public String titulo;
    public String autor;
    public int ano;

    public int i;
    
    Livro(String titulo, int ano, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public Livro() {
    }

    public void listarLivro() {

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Ano de lançamento: " + ano);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
