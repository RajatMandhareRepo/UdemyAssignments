package Programs;

public class pattern7 {

	public static void main(String[] args) {

		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *

		for (int i = 0; i < 5; i++) {

			for (int k = 1; k <= i + 1; k++) {

				System.out.print("*");
				System.out.print("\t");

			}

			System.out.println();

		}

		for (int l = 0; l < 4; l++) {

			for (int j = 4; j > l; j--) {

				System.out.print("*");
				System.out.print("\t");

			}

			System.out.println();

		}

	}

}
