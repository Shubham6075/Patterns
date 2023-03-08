public class p5 {
	public static void main(String[] args) {
		/*  Image triangle :
		            *
		          * *
		        * * *
		      * * * *
		 */
		int n = 4;
		// outer loop : row
		for(int i=n; i>=1; i--) {
			// space loop
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			// column loop
			for(int j=0; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}

