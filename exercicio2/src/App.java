import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opc = 1;
        int i = 0;

        List<Livro> livros = new ArrayList<Livro>();

        do{
            System.out.println("---------------");
            System.out.println("Insira uma das opções abaixo: ");
            System.out.println("[1] Cadastrar novo Livro");
            System.out.println("[2] Listar os Livros");
            System.out.println("[3] Sair");
            System.out.println("---------------");
            opc = Integer.parseInt(scanner.nextLine());
            
            switch (opc) {
                case 1:
                livros.add(new Livro());
                
                    System.out.println("---------------");
                    System.out.print("Insira o titulo do livro: ");
                    livros.get(i).titulo = scanner.nextLine();
                    System.out.print("Insira o autor do livro: ");
                    livros.get(i).autor = scanner.nextLine();
                    System.out.print("Insira o ano de lançamento do livro: ");
                    livros.get(i).ano = Integer.parseInt(scanner.nextLine());
                    System.out.println("---------------");
                    i++;
                    break;
                    case 2:
                    for(int j = 0; j < i; j++) {
                        livros.get(j).listarLivro();
                    }
                    break;
                default:
                    System.out.println("Até Mais!");
                    break;
            }
        }while(opc != 3);
        scanner.close();
    }
}



// public class Main {

//     public static void main(String[] args) {
//         int i;
//         Scanner scanner = new Scanner(System.in);
//         List<Aluno> alunos = new ArrayList<Aluno>();

//         System.out.print("Insira quantos alunos voce deseja cadastrar: ");
//         int num = Integer.parseInt(scanner.nextLine());
        
//         for(i = 0; i < num; i++) {
//             alunos.add(new Aluno());
//         }

//         for(i = 0; i < num ; i++) {
//             System.out.print("Insira seu nome: ");
//             alunos.get(i).nome = scanner.nextLine();
//             System.out.println(alunos.get(i).nome);
//             System.out.print("Insira sua matricula: ");
//             alunos.get(i).matricula = Integer.parseInt(scanner.nextLine());
//             System.out.println(alunos.get(i).matricula);
//             for(int y = 0; y < 5; y++){
//                 do{
//                     System.out.print("Insira o valor de sua nota " + (y + 1) + ":");
//                 alunos.get(i).notas[y] = Float.parseFloat(scanner.nextLine());
//                 } while(alunos.get(i).notas[y] > 10 ||alunos.get(i).notas[y] < 0);
//             } 
            
//         }
        
//         for(i = 0; i < 5; i++) {
//             alunos.get(i).calcMedia();
//         }
//         scanner.close();
//     }
// }
