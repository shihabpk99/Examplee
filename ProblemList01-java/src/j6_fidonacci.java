import java.util.*;
public class j6_fidonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int n = sc.nextInt();
		
	
			
		for(int i=1; i<=n; i++) {
			System.out.println(fibonacci(i)+" ");
		}
				
		

	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		  if (n <= 1) {
	            return n;
	        }
	        return fibonacci(n - 1) + fibonacci(n - 2);
		
	}



}
