package lab02;

public class Task09 {
	
	public static void main(String[] args) {
		
		int n = 4;
		int countZero = 0;
		int countLessZero = 0;
		int countGreaterZero = 0;
		int[] array = new int [n]; 
		
		for (int i = 0; i < n; i++) {

			array[i]= (int) (Math.random() * 20  - 10);
			System.out.print(array[i]+ " ");
			if (array[i] < 0)
				countLessZero ++;
			if (array[i] == 0)
				countZero ++;
			if (array[i] > 0)
				countGreaterZero ++;
			
		}
		System.out.println();
		System.out.println("number of positive numbers : " + countLessZero);
		System.out.println("number of negative numbers : " + countGreaterZero);
		System.out.println("number of 0 : " + countZero);
		
			
	}
	
}
