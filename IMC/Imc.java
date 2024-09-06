public class Imc {
    // Método para calcular o IMC
    public double calcularIMC(double peso, double altura) {
        if (altura > 0) {
            return peso / (altura * altura);
        } else {
            System.out.println("Altura inválida!");
            return 0;
        }
    }
    
    // Método para interpretar o resultado do IMC
    public String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}