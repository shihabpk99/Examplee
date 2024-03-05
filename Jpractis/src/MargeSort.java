
public class MargeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {7,3,5,2,1,9};
		
		int L=0;
		int R=arr.length-1;
		
		
		marge(arr, L, R);
		
		for(int i: arr) {
			System.out.println(i);
		};

	}
	

	private static void marge(int[] arr, int L, int R) {
		// TODO Auto-generated method stub
		
		if(L<R) {
		
		int mid= L+(R-L)/2;
		
		
		marge(arr, L, mid);
		marge(arr, mid+1, R);
		
		marge1(arr, L, mid, R);
		
		}
		
	}
	

	private static void marge1(int[] arr, int L, int mid, int R) {
		// TODO Auto-generated method stub
		int s1= mid-L+1;
		int s2= R-mid;
		
		int[] Left = new int[s1]; 
		int[] Right = new int[s2];
		
		for(int i=0; i<s1; i++) {
			Left[i]=arr[L+i];
		}
		for(int i=0; i<s2; i++) {
			Right[i]= arr[mid=i+i+1];
		}
		
		
		int i=0, j=0, k=L;
		
		while(i<s1 && j<s2 ) {
			if(Left[i]< Right[j]) {
				arr[k]=Left[i];
				i++;
				k++;
			}else {
				arr[k]=Right[j];
				k++;
				j++;
			}			
		}
		
		while(i<s1) {
			arr[k]=Left[i];
			k++;
			j++;
		}
		
		while(j<s2) {
			arr[k]=Right[j];
			k++;
			j++;
		}
		
	}

	

}
