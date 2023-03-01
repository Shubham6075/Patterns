public class p1 {
	public static void main(String[] args) {

		/*   complete rectangle
		      * * * * *
		      * * * * *
		      * * * * *
		      * * * * *
		 */
		int n = 4;
		int m = 5;
		// outer loop : row
		for(int i=0; i<n; i++) {
			// inner loop : column
			for(int j=0; j<m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
