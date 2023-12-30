package Package;

public class Pallindrom {
	public static void main(String[] args) {

		int temp = 12021;

		int reverse = 0;
		int rem;
		int num=temp;
		while (num != 0) {

			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		;
		System.out.println(reverse);

		if (temp == reverse) {
			System.out.println("it is palindrome");
		} 
		
		else {
			System.out.println(num+"not");
		}
	}
}
