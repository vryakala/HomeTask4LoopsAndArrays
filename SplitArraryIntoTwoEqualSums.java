package homeTask4LoopsArrays;

import java.util.Scanner;

public class SplitArraryIntoTwoEqualSums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = scanner.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter array elements");
		for (int i = 0; i < len; i++)
			arr[i] = scanner.nextInt();
		scanner.close();
		boolean b = canBalance(arr);
		System.out.println(b);
	}

	private static boolean canBalance(int[] arr) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
			for (int j = arr.length - 1; j > i; j--) {
				sum2 = sum2 + arr[j];
			}
			if (sum1 == sum2)
				return true;
			sum2 = 0;
		}
		return false;
	}

}
