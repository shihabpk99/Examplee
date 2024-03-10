import java.util.*;
public class j7_StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Character:");	
	 String s = sc.nextLine();
	
			
			int n = 8;
			//
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++ ) {
				System.out.print(s+" ");
			}
			System.out.println();			
		}	
		
		//
		System.out.println();
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("  ");
			}
			for(int j=n; j>i; j-- ) {
				System.out.print(s+" ");
				
			}
			System.out.println();			
		}
		//
		System.out.println();
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n-1; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++ ) {
				System.out.print("   "+s);
			}
			System.out.println();			
		}
		

		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j=n; j>i; j-- ) {
				System.out.print("   "+s);
			}
			System.out.println();			
		}
		
		
			
		

	}

}
