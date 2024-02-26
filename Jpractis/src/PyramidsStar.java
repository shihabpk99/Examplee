
public class PyramidsStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=5;
		
		/*
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}*/
			
			

		for(int i=1; i<=row; i++) {
			for(int j=row-i; j>=1; j--) {
				System.out.print(" ");
			} 
			for(int k=1; k<i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
			
		
		for(int i=1; i<=row; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			} 
			
			for(int k=2*(row-); k>=i-1; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}	
		
		

	}

}
