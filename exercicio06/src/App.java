import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Agenda> agendas = new ArrayList<Agenda>();
        List<Contato> contatos = new ArrayList<Contato>();
        int opc, i = 0, j = 0;

        do{
            System.out.println("[1] Adicionar Contato");
            System.out.println("[2] Procurar Contato");
            System.out.println("[3] Sair");
            opc = Integer.parseInt(scanner.nextLine());

            if(opc != 3) {
                agendas.add(new Agenda());
            }

            switch (opc) {
                case 1:
                    agendas.get(j).adicionarContato(contatos, i, scanner);
                    i++;
                    break;
                case 2:
                    System.out.println("Insira o contato que deseja procurar: ");
                    String nomeCompar = scanner.nextLine();
                    agendas.get(j).procurarContato(i, nomeCompar , contatos);
                    break;
                default:
                    System.out.println("Até mais!");
                    break;
            }
        }while(opc != 3);

    }
}
