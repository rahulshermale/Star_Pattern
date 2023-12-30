package Package;

public class Factoral_Up_to {
public static void main(String[] args) {
	
	
	int k=10;
	
	
	for(int i=1;i<=k;i++) {
		System.out.println(i+"----->"+facto(i));
	}
	
}

private static int facto(int num) {
	int fact=1;
	for(int i=1;i<=num;i++){
		fact =fact* i;
	}
	return fact;
}
}
