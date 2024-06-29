package exemplos;

public class OrdenacaoPorSelecao {
	public static void main(String[] args) {
		
		int [] arr = {64, 25, 12, 22, 11};
		selecaoPorSelecao(arr);
		
		System.out.println("Array ordenado");
		for(int i: arr) {
			System.out.println(i + " ");
		}
	}

	private static void selecaoPorSelecao(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 0; i < n -1; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}		
	}
}