package patterns;

public class AlphabetAPattern {

	public static void main(String[] args) {
		int n = 5;
		/*
		        * * * * * 
				*       * 
				* * * * * 
				*       * 
				*       * 
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || i==3 || j==1 || j==n) {
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
					*         
					*   * * * 
					*       * 
					* * * * * 
		 */
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n || j==1 || (j==n && i>n/2) || (i==3 && j>n/2)) {
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
		            *   * 
					* *   
					*     
					* *   
					*   *  
		 */
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=3; j++) {
				if(j==1 || (i+j==4) || (i-j==2) ) {
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
		            *       * 
					* *   * * 
					*   *   * 
					*       * 
					*       * 
		 */
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1 || j==n || (i-j==0 && i<=3) || (i+j==6 && i<=3)) {
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
		            *       * 
					* *     * 
					*   *   * 
					*     * * 
					*       * 
		 */
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1 || j==n || i==j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
