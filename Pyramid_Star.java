package Demo;

public class Pyramid_Star {
	public static void main(String[] args) {
		int n=4;
	for(int i=1;i<n;i++) {
		for(int k=1;k<n-i;k++ ) {
			
			System.out.print(" ");
			
		}
		for(int j=0;j<2*i-1;j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	
}
}
/*
 * 
 * 1
 * 3
 * 5
 * 7
 * 9
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */