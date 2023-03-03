public class p3 {
	public static void main(String[] args) {
		/* triangle :
		   *
		   * *
		   * * *
		   * * * *
		                  */
		int n = 4;
		// outer loop : row
		for(int i=1; i<=n; i++) {
			// inner loop : column
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
