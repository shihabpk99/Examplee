
public class SeclitionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {7,3,5,8,2,9};
		
		//Time complexity= n*n
		
		for(int i=0; i<arr.length; i++) {
			int small = i;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[small]>arr[j]) {
					small=j;
				}
				
			}
			
			int temp= arr[small];
			arr[small]= arr[i];
			arr[i]= temp;
			
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
