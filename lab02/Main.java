package lab02;

public class Main {

	public static void main(String[] args) {
		int n = 4;
		int k = 2;
		int sum = 0;
		int[] array = new int [n]; 
		for (int i = 0; i < n;i++) {
			array[i]= (int) (Math.random()*80 + 10);
			System.out.println(array[i]);
			
			if(array[i] % k == 0) {
				
				sum = sum + array[i];
				
			}
			
		}
	    System.out.print("sum = " + sum);
	}

}
