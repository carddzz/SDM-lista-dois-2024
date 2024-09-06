import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        String opcao;

        do {
            // Opções de operações
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.print("Opção: ");
            int escolha = scanner.nextInt();

            // Entrada de valores
            System.out.print("Informe o primeiro valor: ");
            double num1 = scanner.nextDouble();

            System.out.print("Informe o segundo valor: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            // Execução da operação escolhida
            switch (escolha) {
                case 1:
                    resultado = calculadora.somar(num1, num2);
                    break;
                case 2:
                    resultado = calculadora.subtrair(num1, num2);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = calculadora.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            // Exibir resultado
            System.out.printf("Resultado: %.2f\n", resultado);

            // Verificar se o usuário quer continuar
            System.out.print("Deseja realizar outra operação? (S/N): ");
            opcao = scanner.next();

        } while (opcao.equalsIgnoreCase("S"));

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}