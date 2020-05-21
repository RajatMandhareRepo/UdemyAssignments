package Programs;

public class pattern3 {

	public static void main(String[] args) {

		// 1   
		// 2 3  
		// 4 5 6 
		// 7 8 9 10

		int k = 1;
		for (int i = 0; i < 4; i++) 
		{

			for (int j = 1; j <= i+1 ; j++)
			{
				System.out.print(k);
				k++;
				System.out.print("\t");
				
			}

			System.out.println();
			
			
			
		}

	}

}
