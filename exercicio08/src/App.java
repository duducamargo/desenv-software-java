import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        List<Pizza> pizzas = new ArrayList<Pizza>();
        Pedidos pedido = new Pedidos(pizzas);
        Scanner scanner = new Scanner(System.in);
        int opc;


        do{
            System.out.println("Insira uma opção");
            System.out.println("[1] Realizar Pedido");
            System.out.println("[2] Listar Pedido");
            System.out.println("[3] Cancelar Pedido");
            System.out.println("[4] Listar Relatório");
            System.out.println("[5] Sair");
            opc = Integer.parseInt(scanner.nextLine());

        switch (opc) {
            case 1:
                pedido.fazerPedido(scanner);
                break;
            case 2:
                System.out.println("Insira o id do pedido que você deseja listar: ");
                int idL = Integer.parseInt(scanner.nextLine());
                pedido.listarPedido(idL);
                break;
            case 3:
                System.out.println("Insira o id do pedido que você deseja cancelar: ");
                int idC = Integer.parseInt(scanner.nextLine());
                pedido.cancelarPedido(idC);
                break;
            case 4:
                pedido.gerarRelatorio();
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Até Mais!");
                break;
        }
        }while(opc != 5);

    }
}
