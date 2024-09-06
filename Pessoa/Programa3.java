import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome da pessoa: ");
        String nome = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome);

        // Realiza as atividades
        pessoa.acordar();
        pessoa.andar();
        pessoa.comer();
        pessoa.dormir();

        scanner.close();
    }
}