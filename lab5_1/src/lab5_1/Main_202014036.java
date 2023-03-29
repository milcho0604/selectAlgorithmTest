package lab5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main_202014036 {

	public static void main(String[] args) {
		System.out.println("lab5_1:김창현");


		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}


		Arrays.sort(array);


		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println(array[1-1]);
		System.out.println(array[(n/2)-1]);
		System.out.println(array[n-1]);

		input.close();
	}
}