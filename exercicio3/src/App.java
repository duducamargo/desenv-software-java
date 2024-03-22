import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

    public static void inserirNome(List<Banco> contas, int i, Scanner scanner) {
        System.out.print("Insira seu nome: ");
        contas.get(i).nome = scanner.nextLine();
    }

    public static void inserirNumeroC(List<Banco> contas, int i, Scanner scanner) {
        System.out.print("Insira o numero de sua conta: ");
        contas.get(i).numConta = Integer.parseInt(scanner.nextLine());
    }

    public static void inserirDeposito(List<Banco> contas, int i, Scanner scanner) {
        System.out.print("Insira um deposito: ");
        float dep = Float.parseFloat(scanner.nextLine());
        contas.get(i).conta += dep;
    }

    public static void saque(List<Banco> contas, int i, Scanner scanner) {
        System.out.print("Insira um saque: ");
        float saq = Float.parseFloat(scanner.nextLine());
        contas.get(i).conta -= saq;
    }

    public static void consulta(List<Banco> contas, int i, Scanner scanner) {
        System.out.print("O seu saldo é: R$" + contas.get(i).conta);
        float saq = Float.parseFloat(scanner.nextLine());
        contas.get(i).conta -= saq;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        int i = 0;
        int opcEntrar = 0;

        List<Banco> contas = new ArrayList<Banco>();
                
        do{
            System.out.println("---------------");
            System.out.println("[1] Entrar na conta");
            System.out.println("[2] Sair");
            System.out.println("---------------");
            opcEntrar = Integer.parseInt(scanner.nextLine());

            switch (opcEntrar) {
                case 1:
                do{
                    System.out.println("---------------");
                    System.out.println("Insira uma das opções");
                    System.err.println("[1] Inserir o nome");
                    System.out.println("[2] Inserir o numero da conta");
                    System.out.println("[3] Realizar saque");
                    System.out.println("[4] Realizar depósito");
                    System.out.println("[5] Realizar consulta");
                    System.out.println("[6] Sair");
                    opc = Integer.parseInt(scanner.nextLine());
                    System.out.println("---------------");

                    contas.add(new Banco());
                    switch (opc) {
                        case 1:
                            inserirNome(contas, i, scanner);
                            break;
                            case 2:
                            inserirNumeroC(contas, i, scanner);
                            break;
                            case 3:
                            saque(contas, i, scanner);
                            break;
                            case 4:
                            inserirDeposito(contas, i, scanner);
                            break;
                            case 5:
                            consulta(contas, i, scanner);
                            break;
                            case 6:
                            i++;
                            break;
                        default:
                        
                            break;
                    }
        
        
                }while(opc != 6);
                break;
                
                default:
                break;
            }
            
        }while(opcEntrar != 2); 
        scanner.close();
    }
}
