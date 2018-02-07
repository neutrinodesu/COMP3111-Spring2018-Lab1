package lans.comp3111.ust.hk;

public class Lab1Activity {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		int i = 0;
		while (i != 10) {
			sum += arr[i];
			i++;
		}
		
		int min = findMin(arr, 10);
		int max = findMax(arr, 10);

		System.out.println(String.format("Sum of the numbers is %d", sum));
		System.out.println("Min = " + min + "; Max = " + max);
		
	}
	
	public static int findMin(int[] array, int n) {
		int min = array[0];
		for (int i = 0; i < n - 1; i++) {
			if (min > array[i + 1])
				min = array[i + 1];
		}
		return min;
	}
	
	public static int findMax(int[] array, int n) {
		int max = array[0];
		for (int i = 0; i < n - 1; i++) {
			if (max < array[i + 1])
				max = array[i + 1];
		}
		return max;
	}

}