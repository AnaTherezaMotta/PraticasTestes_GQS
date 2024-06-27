package media;

public class Media {
		public static double calcularSoma(double[] vetor) { //Encapsulamento pois � usado duas vezes.
	        double soma = 0;
	        for (double valor : vetor) { //for-each
	            soma += valor;
	        }
	        return soma;
	    }

	    public static double calcularMedia(double[] vetor) {
	        double soma = calcularSoma(vetor);
	        return soma / vetor.length; //.lenght para reduzir quantidade de vari�veis
	    }
		public static void main(String[] args) {
				
			
	        double[] vet1 = {90, 88, 78, 76};
	        double[] vet2 = {865, 564, 43, 12};

	        System.out.println("Média Vet1: " + calcularMedia(vet1));
	        System.out.println("Média Vet2: " + calcularMedia(vet2));
	    }

	    

}
