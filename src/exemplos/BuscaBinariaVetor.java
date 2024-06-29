package exemplos;

public class BuscaBinariaVetor {

	public static int buscaBinaria(int[] array, int chave) {
		int inicio = 0;
		int fim = array.length - 1;
		
		while (inicio <= fim) {
			int meio = inicio + (fim - inicio) / 2;
			
			/*Verifica se a chave está no meio*/
			if (array[meio] == chave) {
				return meio;
			}
			
			/*Se a chave é maior, ignore a metade esquerda
			Tudo a esquerda do meio é ignorado, pois o valor não está lá
			Aquilo que antes erá a esquerda, precisa ser modificado para achar o novo
			meio, é como se fosse o novo inicio e como eu não posso destruir o array eu
			simplesmente desloco ele a direita;
			*/
			if(array[meio] < chave) {
				inicio = meio + 1;
			}
			
			/*Se a chave é menor, ignore a metade esquerda*/
			else {
				fim = meio - 1;
			}
		}
		
		/*Se não achar, retorne -1*/
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,40,100,1002,1004,5000};
		int chave = 40;
		int resultado = buscaBinaria(array, chave);
		
		if(resultado == -1) {
			System.out.println("Elemento não encontrado");
		}
		else {
			System.out.println("Elemento encontrado no índice: " + resultado);
		}
	}
}	