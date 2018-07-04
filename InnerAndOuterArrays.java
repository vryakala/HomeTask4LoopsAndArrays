package homeTask4LoopsArrays;

import java.util.Scanner;

public class InnerAndOuterArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Outer Array length");
		int outerlen = scanner.nextInt();
		System.out.println("Enter Outer Array Elements");
		int outarr[] = new int[outerlen];
		for (int i = 0; i < outerlen; i++)
			outarr[i] = scanner.nextInt();
		System.out.println("Enter Inner Array length");
		int innerlen = scanner.nextInt();
		System.out.println("Enter Inner Array Elements");
		int inarr[] = new int[innerlen];
		for (int i = 0; i < innerlen; i++)
			inarr[i] = scanner.nextInt();
		scanner.close();
		boolean b = linearIn(outarr, inarr);
		System.out.println(b);
	}

	private static boolean linearIn(int[] outer, int[] inner) {
		int count = 0;
		int j = 0;
		if (inner.length == 0)
			return true;
		for (int i = 0; i < outer.length; i++) {
			if (outer[i] == inner[j]) {
				count++;
				j++;
			} else if (outer[i] > inner[j]) {
				return false;
			}
			if (count == inner.length) {
				return true;
			}
		}
		return false;

	}
}