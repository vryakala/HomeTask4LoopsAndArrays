package homeTask4LoopsArrays;

import java.util.Scanner;

public class Span {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = scanner.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter array elements");
		for (int i = 0; i < len; i++)
			arr[i] = scanner.nextInt();
		scanner.close();
		int span = maxSpan(arr);
		System.out.println(span);
		;
	}

	private static int maxSpan(int[] arr) {
		int max = 1;
		int c = 0;
		if (arr.length == 0) {
			return 0;
		} else {
			for (int a = 0; a < arr.length; a++) {
				for (int b = arr.length - 1; b > a; b--) {
					if (arr[a] == arr[b]) {
						c = b - a + 1;
					}
					if (c > max)
						max = c;
				}
			}
			return max;
		}
	}
}