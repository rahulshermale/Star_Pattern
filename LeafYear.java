package Package;

public class LeafYear {
	public static void main(String[] args) {

		int year=2000;
		
		if(year%400==0) {
			System.out.println("it is lep year");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println("Its leap year");
			
			
		}
		else {
			System.out.println("it s not lef year");
		}
	}
}
