package lab02;

public class Task08 {
	public static void main(String[] args) {
		
		int n = 4;
		int[] array = new int [n]; 
		
		for (int i = 0; i < n;i++) {

			array[i]= (int) (Math.random()*10);
			System.out.print(array[i] + " ");
        			
		}
		System.out.println();
		System.out.print("Numbers that are greater that index : ");
		for (int i = 0; i < n;i++) {
			if(array[i] > i) {
				
				System.out.print(array[i] + " ");
				
			}
			
		}
		
    }
	
}