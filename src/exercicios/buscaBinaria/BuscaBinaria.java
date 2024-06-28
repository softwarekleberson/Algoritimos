package exercicios.buscaBinaria;

public class BuscaBinaria {
	public static void main(String[] args) {
		
		int chave = 1;
		int []array = {1,2,3,5,10,14,15,18,20,22,40};
		int resultado = buscaBinaria(chave, array);
		
		if(resultado != -1) {
			System.out.println("Elemento na posição " + resultado);
		}
		else {
			System.out.println("Elemento não está no array");
		}
	}

	private static int buscaBinaria(int chave, int[] array) {
		int inicio = 0;
		int fim = array.length - 1;
		
		while(inicio <= fim) {
			int meio = inicio + (fim - inicio) / 2;
			
			if(array[meio] == chave) {
				return meio;
			}
			
			if(array[meio] < chave) {
				inicio = meio + 1;
			}
			
			else {
				fim = meio - 1;
			}
		}
		
		return -1;
	}
}