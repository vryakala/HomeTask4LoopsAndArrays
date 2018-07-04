package homeTask4LoopsArrays;

import java.util.Scanner;

public class MirrorSelection {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of array");
		int len = scanner.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter array elements");
		for (int i = 0; i < len; i++)
			arr[i] = scanner.nextInt();
		scanner.close();
		int i = maxMirror(arr);
		System.out.println(i);
	}

	private static int maxMirror(int[] arr) {
		String substr = "";
		int maxlength = 0;
		int count = 0;
		String str = "";

		for (int i = 0; i < arr.length; i++) {
			str = str.concat(Integer.toString(arr[i]));
		}

		String reverse = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			reverse = reverse.concat(Integer.toString(arr[i]));
		}

		for (int i = -1; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				substr = substr.concat(Integer.toString(arr[j]));

				if (reverse.contains(substr)) {
					count++;
					if (count > maxlength) {
						maxlength = count;
					}
				}
			}
			count = 0;
			substr = "";
		}
		return maxlength;
	}

}
