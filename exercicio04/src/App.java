import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void novoJogador(int id, List<Jogador>jogadores, Scanner scanner) {
        System.err.println("O seu id é: " + id);
        System.out.print("Insira o nome do jogador: ");
        jogadores.get(id).nome = scanner.nextLine();
        
        System.out.print("Insira a pontuação do jogador: ");
        jogadores.get(id).pontuacao = Float.parseFloat(scanner.nextLine());

        System.out.print("Insira o nivel do jogador: ");
        jogadores.get(id).nivel = Integer.parseInt(scanner.nextLine());

    }

    public static void alterarJogador(int id, List<Jogador>jogadores, Scanner scanner) {
        int escolha;

        System.out.print("Insira o Id do jogador que você deseja alternar o nivel: ");
        escolha = Integer.parseInt(scanner.nextLine());
                System.out.println("Jogador: " + jogadores.get(escolha).nome);
                System.out.println("Pontuação: " + jogadores.get(escolha).pontuacao);
                System.out.println("Nivel: " + jogadores.get(escolha).nivel);

                System.out.print("Insira o novo nivel do jogador: ");
                jogadores.get(escolha).nivel = Integer.parseInt(scanner.nextLine());
        }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<Jogador> jogadores = new ArrayList<Jogador>();
        int opc;
        int i = 0;

        do{
            System.out.println("[1] Inserir novo jogador");
            System.out.println("[2] Subir de nivel");
            System.out.println("[3] Sair");
            opc = Integer.parseInt(scanner.nextLine());

            if(opc != 3 ){
                jogadores.add(new Jogador());
            }

            switch (opc) {
                case 1:
                    novoJogador(i, jogadores, scanner);
                    i++;
                    break;
                case 2:
                    alterarJogador(i, jogadores, scanner);
                    break;
                default:
                    System.out.println("Até Mais!");
                    break;
            }

        }while(opc != 3);
    }
}
