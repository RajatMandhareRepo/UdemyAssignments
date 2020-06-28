package Programs;

public class pattern10 {

	public static void main(String[] args) {
		
//	      *
//	     ***
//	    *****
//	   *******
//	  *********
//	   *******
//	    *****
//	     ***
//	      *

		for (int i = 0; i <= 5; i++) {

			for (int j = i; j <= 5; j++) {

				System.out.print(" ");

			}
			for (int k = 1; k < (i * 2); k++) {
				System.out.print("*");

			}
			System.out.println();

		}
		
		for (int i = 4; i >= 1; i--) {
			
			System.out.print(" ");  // Extra one space is requires thats why we added this step while merging.
			
			for (int j = 5; j > i; j--) {

				System.out.print(" ");

			}
			
			for (int k = 1; k < (i * 2); k++) {
				
				System.out.print("*");

			}
			
			System.out.println();

		}

	}

}
