package lab02;

public class Task03 {

	public static void main(String[] args) {
		int n = 4;
		double[] array = new double [n]; 
		
		for (int i = 0; i < n;i++) {
			
			array[i]= (Math.random()*10 + 1);
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
		for (int i = 1; i < n; i++) {
			
			if(array[i] > array[i-1]) {
				if(i == n - 1)
				   System.out.print("This array is increasing");
				
			}
			
			else {
				
				System.out.print("This array isn't increasing");
				break;
				
			}
			   	
		}	

	}

}
