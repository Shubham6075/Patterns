public class p2 {
	public static void main(String[] args) {
		/* Hollow Rectangle
		     * * * * *
		     *       *
		     *       *
		     * * * * *
		 */
		int n = 4;
		int m = 5;
		// outer loop : row
		for(int i=0; i<n; i++) {
			// inner loop : column
			for(int j=0; j<m; j++) {
				if(i == 0 || i == n-1 || j == 0 || j == m-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
