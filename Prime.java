package Package;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	int temp=0;
	
	for(int i=2;i<=num-1;i++) {
		if(num%i==0) {
		temp=temp+1;
		}
		System.out.println(i);
		System.out.println(temp);
		
	}
	if(temp>0) {
		System.out.println("Is Not Prime :");
	}
	else {
		System.out.println("Is prime");
	}
}
}
