import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedidos {
    private List<Pizza> pizzas;

    public Pedidos(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void fazerPedido(Scanner scanner) {
        List<String> nomes = new ArrayList<>();
        double valor = 0;
        int id = 0;
        String endereco = "";
        
        System.out.println("Quantidade de sabores: ");
        System.out.println("[1] Sabor, valor R$49.99");
        System.out.println("[2] Sabores, valor R$59.99");
        System.out.println("[3] Sabores, valor R$64.99");
        int sabores = Integer.parseInt(scanner.nextLine());

        switch (sabores) {
            case 1:
                valor = 49.99;
                break;
            case 2:
                valor = 59.99;
                break;
            case 3:
                valor = 65.99;
                break;
            default:
                System.out.println("Opção Inválida!");
                return; // Sair do método se a opção for inválida
        }

        for(int j = 0; j < sabores; j++) {
            System.out.println("Insira o " + (j + 1) +"° sabor: ");
            System.out.println("[1] Calabresa");
            System.out.println("[2] Quatro Queijos");
            System.out.println("[3] Portuguesa");
            System.out.println("[4] Outro");
            int saborPizza = Integer.parseInt(scanner.nextLine());

            switch (saborPizza) {
                case 1:
                    nomes.add("Calabresa");
                    break;
                case 2:
                    nomes.add("Quatro Queijos");
                    break;
                case 3:
                    nomes.add("Portuguesa");
                    break;
                case 4:
                    System.out.println("Insira o nome do sabor: ");
                    nomes.add(scanner.nextLine());
                    break;
                default:
                    System.out.println("Opção Inválida");
                    return;
            }
        }

        System.out.println("Insira o id do pedido: ");
        id = Integer.parseInt(scanner.nextLine());

        System.out.println("Insira o endereço para Entrega: ");
        endereco = scanner.nextLine();

        Pizza pizza = new Pizza(nomes, valor, id, endereco);

        pizzas.add(pizza);
    }

    public void cancelarPedido(int id) {
        for(int j = 0; j < pizzas.size(); j++) {
            if(pizzas.get(j).id == id) {
                pizzas.remove(j);
                return; 
            }
        }
        System.out.println("Pedido não encontrado.");
    }

    public void listarPedido(int id) {
        boolean encontrado = false;
        for (Pizza pizza : pizzas) {
            if (pizza.id == id) {
                encontrado = true;
                System.out.println("Sabor(es): ");
                for (String sabor : pizza.nomes) {
                    System.out.println("- " + sabor);
                }
                System.out.println("Endereço: " + pizza.endereco);
                System.out.println("Valor: R$" + pizza.valor);
                return; 
            }
        }
        if(!encontrado)System.out.println("Pedido não encontrado.");
    }

    public void gerarRelatorio() {
        int totalPedidos = pizzas.size();
        double totalValor = 0;

        for (Pizza pizza : pizzas) {
            totalValor += pizza.valor;
        }

        double mediaPreco = totalPedidos > 0 ? totalValor / totalPedidos : 0;

        System.out.println("Número total de pedidos realizados: " + totalPedidos);
        System.out.println("O total pedido foi de R$" + totalValor);
        System.out.println("Média de preço dos pedidos: " + mediaPreco);
    }
}
