package lab02;

public class Task10 {

	public static void main(String[] args) {
		
		int n = 3;
		int max = 0;
		int sumOfElenents;
		int[] array = new int [n*2]; 
		
		for (int i = 0; i < n*2; i++) {

			array[i]= (int) (Math.random() * 20);
			System.out.print(array[i]+ " ");
		
		}
		
		for (int i = 0; i < n; i++) {
			sumOfElenents = array[i] + array[n-1];
			n--;
			if(sumOfElenents > max)
			   max = sumOfElenents;
		}
		System.out.println();
		System.out.println("Max combination = " + max);
		
	}
	
}