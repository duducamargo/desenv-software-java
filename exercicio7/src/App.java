import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static void adicionarProduto(List<Produto> produtos,int i, Scanner scanner) {
        produtos.add(new Produto());
        System.out.print("Insira o nome do produto: ");
        produtos.get(i).nome = scanner.nextLine();
        System.out.print("Insira o Id do produto: ");
        produtos.get(i).id = Integer.parseInt(scanner.nextLine());
        System.out.print("Insira a quantidade no estoque desse produto: ");
        produtos.get(i).quant = Integer.parseInt(scanner.nextLine());
        System.out.print("Insira o valor de cada unidade do produto: ");
        produtos.get(i).preco = Double.parseDouble(scanner.nextLine());
    }

    public static void retirarProduto(List<Produto> produtos,int i, Scanner scanner) {
        System.out.print("Insira o id do produto que deseja retirar do estoque: ");
        int idComp = Integer.parseInt(scanner.nextLine());

        for(int j = 0; j < i; j++) {
            if(produtos.get(j).id == idComp) {
                produtos.remove(j);
                break;
            }
        }
    }

    public static void atualizarProduto(List<Produto> produtos,int i, Scanner scanner) {
        int opc = 0;

        System.out.print("Insira o Id do produto que você deseja atualizar: ");
        int idComp = Integer.parseInt(scanner.nextLine());

        for(int j = 0; j < i; j++) {
            if(produtos.get(j).id == idComp) {
                do{
                    System.out.println("[1] Alterar quantidade de estoque");
                    System.out.println("[2] Alterar preço do produto");
                    System.out.println("[3] Sair");
                    opc = Integer.parseInt(scanner.nextLine());

                    switch (opc) {
                        case 1:
                            System.out.println("Quantidade em estoque atual: " + produtos.get(j).quant);
                            System.out.print("Insira a quantidade em estoque atualizada: ");
                            produtos.get(j).quant = Integer.parseInt(scanner.nextLine());
                            break;
                        case 2: 
                            System.out.println("Valor atual: " + produtos.get(j).preco);
                            System.out.print("Insira o preço do produto atualizado: ");
                            produtos.get(j).preco = Double.parseDouble(scanner.nextLine());
                        default:
                            break;
                    }

                }while(opc != 3);
            }
        }
    }

    public static void listarProdutos(List<Produto> produtos,int i, Scanner scanner) {
        for(int j = 0; j < i; j++) {
            System.out.println("--------------");
            System.out.println("Nome: " + produtos.get(j).nome);
            System.out.println("Id: " + produtos.get(j).id);
            System.out.println("Quantidade em estoque: " + produtos.get(j).quant);
            System.out.println("Preço: " + produtos.get(j).preco);
            System.out.println("--------------");
        }
    }

    public static void valorEstoque(List<Produto> produtos,int i, Scanner scanner) {
        double valorTotal = 0.0;
        
        for(int j = 0; j < i; j++) {
            valorTotal += (produtos.get(j).preco * produtos.get(j).quant);
        }

        System.out.println("Valor total do estoque é: " + valorTotal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<Produto>();
        int i = 0;
        int opc = 0;

        do{
            System.out.println("Insira uma opção: ");
        System.out.println("[1] Adicionar produto");
        System.out.println("[2] Atualizar informações");
        System.out.println("[3] Retirar produto do estoque");
        System.out.println("[4] Listar produtos");
        System.out.println("[5] Preço total do estoque");
        System.out.println("[6] Sair");
        opc = Integer.parseInt(scanner.nextLine());

        switch (opc) {
            case 1:
                adicionarProduto(produtos, i, scanner);
                i++;
                break;
            case 2: 
                atualizarProduto(produtos, i, scanner);
                break;
            case 3:
                retirarProduto(produtos, i, scanner);
                i--;
                break;
                case 4: 
                listarProdutos(produtos, i, scanner);
                break;
            case 5:
                valorEstoque(produtos, i, scanner);
                break;
            default:
                System.out.println("Até Mais!");
                break;
        }

        } while(opc != 6);


    }
}
