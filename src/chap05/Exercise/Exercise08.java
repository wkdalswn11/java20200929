package chap05.Exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}	
		};
		int sum1 = 0;
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				sum += array[i][k];
				sum1++;
				avg = (double) sum / sum1;
				
				
			}
		}
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
