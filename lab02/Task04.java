package lab02;

public class Task04 {
	public static void main(String[] args) {
		
		int n = 4;
		int k = 0;
		int count = 0;
		int[] array = new int [n]; 
		
		for (int i = 0; i < n; i++) {

			array[i]= (int) (Math.random()*10 + 1);
			System.out.println(array[i]);
			
			if(array[i] % 2 == 0) {
				
				k++;
				
			}
			
		}
		if(k > 0) {

		   System.out.print("Array of even numbers:");
		   int[] newArray = new int [k];
		
		   for (int i = 0; i < n; i++) {
		  	
		      if(array[i] % 2 == 0) {
		    	  
			     newArray[count] = array[i];
			     System.out.print(" " + newArray[count]);
			     count++;
			     
			   
		      }
		   }
		}
		
		else
	       System.out.print("There is no even numbers in array.");
		
	}
}
