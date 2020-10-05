package lab02;

public class Task07 {

	public static void main(String[] args) {
		int n = 4;
		int max = 0;
		int max_i = 0;
		int min_i = 0;
		int min = 10000;
		int[] array = new int [n]; 
		
		for (int i = 0; i < n; i++) {

			array[i]= (int) (Math.random()*10 + 1);
			System.out.print(array[i] + " ");
			if(array[i] > max) {
				max = array[i];
				max_i = i;
			}
			if(array[i] < min) {
				min = array[i];
				min_i = i;
			}
		}
		
		array[max_i] = min;
		array[min_i] = max;
		System.out.println();
		System.out.print("New array :");
		for (int i = 0; i < n; i++) {

			System.out.print(array[i] + " ");
			
		}

	}

}
