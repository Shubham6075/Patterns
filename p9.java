public class p9 {
	public static void main(String [] args) {
		/*
		        1
		        0 1
		        1 0 1
		        0 1 0 1
		        1 0 1 0 1
		 */
		int n = 5;
		// outer loop : row
		for(int i=1; i<=n; i++) {
			// inner loop : column
			for(int j=1; j<=i; j++) {
				if((i+j) % 2 == 0) {
					System.out.print(1+" ");
				} else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}

}
