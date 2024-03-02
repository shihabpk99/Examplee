import java.util.*;
public class SeclationSort {
	public static void main(String[] args) {
		
		int[] arr= {7,4,3,5,9,1,6};		
		for(int i: arr) {
			System.out.print(i +" ");}
		
		
	for(int i=0; i<arr.length; i++) {
		int small=i;
		
		for(int j=i+1; j<arr.length; j++) {
			if(arr[small]>arr[j]) {
				small=j;
			}
		}
		
		int temp=arr[small];
		arr[small]=arr[i];
		arr[i]=temp;
	}
		
	System.out.println();
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		
	}
}
