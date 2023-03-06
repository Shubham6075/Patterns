public class p4 {
	public static void main(String[] args) {
		/* Inverted triangle :
		   * * * *
		   * * *
		   * *
		   *
		          */
		int n = 4;
		// outer loop : row
		for(int i=n; i>=1; i--) {
			// inner loop : column
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
