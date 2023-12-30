package Package;

public class SumOfDigitUSingRecursion {
	public static void main(String[] args) {
		int num = 12345555;

		System.out.println(getNum(num));
	}

	public static int getNum(int num) {

		if (num == 0) {
			return 0;
		}
		return (num % 10) + getNum(num / 10);
	}
}
