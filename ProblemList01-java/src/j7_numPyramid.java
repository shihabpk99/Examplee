import java.util.*;
public class j7_numPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		
		//System.out.print("Enter a Latter: ");
		//char s = sc.next().charAt(0);
		int n=5;
		
		for(int i=1; i<=n; i++ ) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		//
		System.out.println();
		
		int a =65;
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print((char)(a+j)+" ");
			  
			}
			
			System.out.println();
		}
		
		
	}

}
