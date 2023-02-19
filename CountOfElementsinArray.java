package day1;

public class CountOfElementsinArray {
	
	// Time complexity: O(n2)
	private static void countfreq(int[] arr, int n) {
		boolean[] visited = new boolean[n];
		
		for(int i=0; i<n; i++) {
			int count = 1;
			
			if(visited[i] == true)
				continue;
			
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println("Count of "+arr[i]+" is: "+count);
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,1,1,3,2,1,1};
		countfreq(arr, arr.length);
	}

}
