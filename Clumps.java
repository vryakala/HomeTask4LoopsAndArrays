package homeTask4LoopsArrays;

import java.util.Scanner;

public class Clumps {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = scanner.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter array elements");
		for (int i = 0; i < len; i++)
			arr[i] = scanner.nextInt();
		scanner.close();
		int clump = countClumps(arr);
		System.out.println(clump);
	}

	private static int countClumps(int[] arr) {
		int count = 0;
		int i = 0;

		while (i < arr.length) {
			int val = arr[i];
			i++;
			int length = 1;
			while (i < arr.length && arr[i] == val) {
				i++;
				length++;
			}
			if (length > 1)
				count++;
		}
		return count;
	}
}