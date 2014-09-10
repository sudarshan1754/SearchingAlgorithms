import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Number of elements in the array:");
		int N = input.nextInt();

		int SortedArray[] = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println("Enter the element no. " + (i + 1));
			SortedArray[i] = input.nextInt();
		}

		System.out.println("Enter the Key to be searched:");
		int key = input.nextInt();

		/*
		 * Binary Search with Complexity: log n
		 */
		int l = 0, r = N - 1, m;
		while (l <= r) {
			m = (l + r) / 2;
			if (SortedArray[m] == key) {
				System.out.println("Key found at position: " + m);
				System.exit(0);
			} else if (key < SortedArray[m]) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		System.out.println("Key Not found");

	}

}
