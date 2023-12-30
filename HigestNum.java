package Package;

import java.util.Scanner;

public class HigestNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Num 1 :");

	int num1 = sc.nextInt();
	System.out.println("Enter Num 1 :");
	int num2 = sc.nextInt();
	
	if(num2==num1) {
		System.out.println("Both ARE EQUAL");
	}
	else if(num1>num2) {
	
	System.out.println("Number 1 is Greter :"+num1);
	
}
else {
	System.out.println("num 2 is gretyest :" +num2);
}
}
}
