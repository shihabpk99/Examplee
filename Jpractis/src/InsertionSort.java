import java.util.*;
public class InsertionSort {
	public static void main(String[] args) {
		
		int[] arr= {7,3,5,8,2,9};
		
		//Time complexity= n*n
		
		for(int i=1; i<arr.length; i++) {
			
			int k=arr[i];
			int j=i-1;
			
			while( j>=0 && arr[j]>k ) {
				
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=k;		
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
