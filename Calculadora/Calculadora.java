public class Calculadora {
    // Método somar dois números
    public double somar(double a, double b) {
        return a + b;
    }

    // Método subtrair dois números
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método multiplicar dois números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método  dividir dois números
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
    }
}