package lab02;

public class Task05 {

	public static void main(String[] args) {
		
		int n = 4;
		int max = 0;
		int min = 10000;
		int[] array = new int [n]; 
		
		for (int i = 0; i < n; i++) {

			array[i]= (int) (Math.random()*10 + 1);
			System.out.println(array[i]);
			if(array[i] > max)
				max = array[i];
			if(array[i] < min)
				min = array[i];
		}
		
		System.out.println("Минимальная длина числовой осси = " + (max - min));

	}

}
