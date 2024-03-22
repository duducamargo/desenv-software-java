import java.util.Scanner;

public class Calculadora {

    public static float soma(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtracao(float num1, float num2) {
        return num1 - num2;
    }

    public static float multiplicacao(float num1, float num2) {
        return num1 * num2;
    }

    public static float divisao(float num1, float num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora");
        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1. Soma (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            if (opcao == 5) {
                System.out.println("Obrigado por usar a calculadora!");
                break;
            }

            System.out.print("Insira o primeiro valor: ");
            float num1 = scanner.nextFloat();

            System.out.print("Insira o segundo valor: ");
            float num2 = scanner.nextFloat();

            float resultado = 0;
            switch (opcao) {
                case 1:
                    resultado = soma(num1, num2);
                    break;
                case 2:
                    resultado = subtracao(num1, num2);
                    break;
                case 3:
                    resultado = multiplicacao(num1, num2);
                    break;
                case 4:
                    try {
                        resultado = divisao(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    continue;
            }

            System.out.println("O resultado da operação é: " + resultado);
        }

        scanner.close();
    }

}
