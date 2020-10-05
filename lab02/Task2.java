package lab02;

public class Task2 {

	public static void main(String[] args) {
		
		int n = 4;
		int k = 0;
		int count = 0;
		int[] array = new int [n]; 
		
		for (int i = 0; i < n;i++) {

			array[i]= (int) (Math.random()*10 - 1);
			System.out.println(array[i]);
			
			if(array[i] == 0) {
				
				k = k + 1;
				
			}
			
		}
		if(k!=0) {

		   System.out.print("Array of positions:");
		   int[] newArray = new int [k];
		
		   for (int i = 0; i < n;i++) {
		  	
		      if(array[i] == 0) {
		    	  
			     newArray[count] = i;
			     count++;
			     System.out.print(" " + i);
			   
		      }
		   }
		}
		else
			   System.out.print("There is no 0 in array.");
		
	}
	
}




