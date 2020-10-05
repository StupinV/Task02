package lab02;

public class Task06 {

	public static void main(String[] args) {
		int n = 4;
		double z = 7;
		int count = 0;
		double[] array = new double [n]; 
		
		for (int i = 0; i < n; i++) {

			array[i]=(Math.random()*10 + 1);
			System.out.print(array[i]+ " ");
			if(array[i] > z) {
				array[i] = z;
				count++;
			}
               
		}
		System.out.println();
		System.out.println("New array : ");
		for (int i = 0; i < n; i++) {
			
			System.out.print(array[i]+ " ");
               
		}
		System.out.println();		
		System.out.println("Number of changes = " + count);

	}

}
