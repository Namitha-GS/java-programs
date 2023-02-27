package day2;

public class RemoveDuplicateElementsFromArrayWOExtraSpace {
	
	private static int removeDuplicates(int[] a, int length) {
		if(length == 0 || length == 1)
			return length;
		
		int j=0;
		for(int i=0; i<length-1; i++) {
			if(a[i] != a[i+1]) {
			   a[j++] = a[i];
			}
		}
		a[j++]=a[length-1];
		return j;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,3,4,6,6,7};
		int n = removeDuplicates(arr, arr.length);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
