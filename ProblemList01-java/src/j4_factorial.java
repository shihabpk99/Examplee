import java.util.*;
public class j4_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number= ");
		int n=scanner.nextInt();
		
		int fac=1;
		
		for(int i=1; i<=n; i++) {
			fac*=i;
		}
	System.out.println("Factorial of "+n+" = "+fac);
	
	System.out.println(fact(n));
	
	}
	//Recurtion
	public static int fact(int x) {
		if(x>1) {
			return x*fact(x-1);
			
		}else {
			return 1;
		}
		
	}
	
	

}
