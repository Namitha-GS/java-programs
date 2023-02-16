package hollow_pattern;

public class TriangleHollow1 {

	public static void main(String[] args) {
		int n = 5;
		
		/*
		            * 
					* * 
					*   * 
					*     * 
					* * * * * 
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(j==1 || i==n || i==j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/* 
		            * * * * * 
					*     * 
					*   * 
					* * 
					* 
		 */
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				if(i==1 || j==i || j==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
