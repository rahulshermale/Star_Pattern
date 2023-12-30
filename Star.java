package Demo;

public class Star {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int l=17;
		for(int i =1;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=l-2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
