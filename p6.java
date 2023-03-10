public class p6 {
	public static void main(String []args) {
		/*
		    1
		    1 2
		    1 2 3
		    1 2 3 4
		    1 2 3 4 5
		 */
		int n = 5;
		// outer loop : row
		for(int i=1; i<=n; i++) {
			// inner loop : column
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
