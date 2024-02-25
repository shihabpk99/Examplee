import java.util.*;
public class j5_PrimeN {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.print("Enter number: ");
		int n=scanner.nextInt();
		
		boolean p=true;
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				p=false;
				break;
			}
		}
		
		if(p) {
			System.out.println(n+" is a Prime number.");
		}else {
			System.out.println(n+" isn't a Prime number.");
		}
		
	}

}
