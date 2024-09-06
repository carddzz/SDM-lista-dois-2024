import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Imc imcCalculator = new Imc();
        String opcao;


        do {

            //Entrada dos dados
            System.out.print("Informe o peso(kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Informe a altura(m): ");
            double altura = scanner.nextDouble();

            //Calculo IMC
            double imc = imcCalculator.calcularIMC(peso, altura);

            //Resultado
            System.out.printf("Seu IMC é: %.2f - %s\n", imc, imcCalculator.interpretarIMC(imc));

            //Verificar se o usuario deseja continuar
            System.out.printf("Deseja calcular outro IMC? (S/N): ");
            opcao = scanner.next();

        }

        while (opcao.equalsIgnoreCase("S"));
            
            scanner.close();
            System.err.println("Programa encerrado.");
    }


}
