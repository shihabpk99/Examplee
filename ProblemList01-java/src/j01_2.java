import java.util.*;



public class j01_2 {
	public static void main(String[] args) {
		
		int x=10;
		
		for(int i=100; i>0; i--) {
			System.out.print(i+" ");
		}
		
		
		int sum=0;
		for(int i=1; i<=x; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		int sum1 = recu(x);
		System.out.println(sum1);
	
	

	}
	public static int recu(int x) {
		if(x==1) {
			return 1;
		}else {
		return x + recu(x-1);
		}
	}

}
