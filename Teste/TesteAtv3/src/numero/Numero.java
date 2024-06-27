package numero;

public class Numero {

	  
	    public double raizCubica(double numero) {
	        return Math.cbrt(numero);
	    }

	    public int fatorial(int numero) {
	        if (numero < 0) {
	            throw new IllegalArgumentException("Número deve ser positivo");
	        }
	        int fatorial = 1;
	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	    }

	    public int somaIntervalo(int numero) {
	        if (numero < 0) {
	            throw new IllegalArgumentException("Número deve ser não-negativo");
	        }
	        int soma = 0;
	        for (int i = 1; i <= numero; i++) {
	            soma += i;
	        }
	        return soma;
	    }

	    public static void main(String[] args) {
	        Numero numero = new Numero();

	        // Testes manuais
	        System.out.println("Teste raizCubica(27.0): " + numero.raizCubica(27.0));
	        System.out.println("Teste raizCubica(20.0): " + numero.raizCubica(20.0));
	        System.out.println("Teste fatorial(5): " + numero.fatorial(5));
	        System.out.println("Teste fatorial(0): " + numero.fatorial(0));
	        System.out.println("Teste somaIntervalo(5): " + numero.somaIntervalo(5));
	        System.out.println("Teste somaIntervalo(0): " + numero.somaIntervalo(0));
	    }
	
}
