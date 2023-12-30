package Package;

import java.util.Scanner;

public class findPrime {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int temp = 0;
		int count = 0;
		for (int i = 2; i < num; i++) {

			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					temp = temp + 1;
				}

			}
			
			if (temp == 0) {
				count++;
				System.out.print(" "+i);
			} else {
				temp = 0;
			}

		}
		System.out.println();
		System.out.println(count);
	}
}
