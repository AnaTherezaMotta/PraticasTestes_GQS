package imc;

public class CalculoIMC {
	private double peso;
    private double altura;

    public CalculoIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 20) {
            return "Abaixo do peso";
        } else if (imc >= 20 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 40) {
            return "Obeso";
        } else {
            return "Obeso mórbido";
        }
    }

}
