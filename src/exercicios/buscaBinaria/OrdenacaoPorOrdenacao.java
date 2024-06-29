package exercicios.buscaBinaria;

public class OrdenacaoPorOrdenacao {
	public static void main(String[] args) {
		
		int []array = {64, 25, 0, 5, 12, 22, 11};
		selecaoPorOrdenacao(array);
		
		System.out.println("Array ordenado");
		for(int i: array) {
			System.out.println(i + " ");
		}
	}

	private static void selecaoPorOrdenacao(int[] array) {
	
		int n = array.length;
		
		for(int i = 0; i < n - 1; i++) {
			int minValue = i;
			
            // Encontra o índice do menor elemento restante
			for(int j = i + 1; j < n; j++) {
				if(array[j] < array[minValue]) {
					minValue = j;
				}
			}
			
			int temp = array[minValue];
			array[minValue] = array[i];
			array[i] = temp;
		}
		
	}
}