import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static void novoCarro(int i, Scanner scanner, List<Carro>carros){
        carros.add(new Carro());
        System.out.print("Insira a marca do carro: ");
        carros.get(i).marca = scanner.nextLine();

        System.out.print("Insira o modelo do carro: ");
        carros.get(i).modelo = scanner.nextLine();

        System.out.print("Insira o ano do carro: ");
        carros.get(i).ano = Integer.parseInt(scanner.nextLine());

        System.out.print("Insira a velocidade que o carro esta: ");
        carros.get(i).velocidade = Double.parseDouble(scanner.nextLine());
    }

    public static void alterarCarro(int i, List<Carro>carros, Scanner scanner) {
        int opc;

        System.out.print("Insira o Id do carro que você quer alterar: ");
        int id = Integer.parseInt(scanner.nextLine());

        for(int j = 0; j < i; j++) {
            if(carros.get(j).id == id) {
                System.out.println("Velocidade do carro: " + carros.get(id).velocidade);
                System.out.println("[1] Acelerar");
                System.out.println("[2] Frear");
                System.out.println("[3] Sair");
                opc = Integer.parseInt(scanner.nextLine());

                switch (opc) {
                    case 1:
                        carros.get(id).acelerar(carros.get(id).velocidade);
                        System.out.println("A nova velocidade do carro é " + carros.get(id).velocidade);
                        break;
                    case 2:
                        carros.get(id).frear(carros.get(id).velocidade);
                        System.out.println("A nova velocidade do carro é " + carros.get(id).velocidade);
                    default:
                        System.out.println();
                        break;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<Carro>();
        int opc, i = 0;

        do{
            System.out.println("[1] Cadastrar novo carro");
            System.out.println("[2] Alterar carro");
            System.out.println("[3] Sair");
            opc = Integer.parseInt(scanner.nextLine());

            switch (opc) {
                case 1:
                novoCarro(i, scanner, carros);
                i++;
                break;
                case 2:
                alterarCarro(i, carros, scanner);
                break;
                default:
                break;
            }
        }while(opc != 3);
        scanner.close();
    }
}
