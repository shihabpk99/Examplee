import java.util.*;
public class j3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double n = scanner.nextDouble();
		double sum=0.0;
		
		for(int i=1; i<=n; i++) {
			sum+=1.0/i;
		}
		
		System.out.println(sum);
	}
	

}
