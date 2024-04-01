import java.util.List;
import java.util.Scanner;

public class Agenda {
    List<Contato> contatos;
    
    public void adicionarContato(List<Contato>contatos, int i, Scanner scanner)  {
        contatos.add(new Contato());
        System.out.println("Insira o nome do Contato: ");
        contatos.get(i).nome = scanner.nextLine();
        System.out.println("Insira o telefone desse contato: ");
        contatos.get(i).telefone = Integer.parseInt(scanner.nextLine());
    }

    public void procurarContato(int i, String nomeComp, List<Contato> contatos){
        for(int j = 0; j < i; j++) {
            if(contatos.get(j).nome.equalsIgnoreCase(nomeComp)) {
                System.out.println("---------------");
                System.out.println("Nome: " + contatos.get(j).nome);
                System.out.println("Telefone: " + contatos.get(j).telefone);
                System.out.println("---------------");
            }
        }
    }
    
}