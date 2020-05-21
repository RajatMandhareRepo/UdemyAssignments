package Programs;

public class pattern4 {

	public static void main(String[] args) {

		// 3   
		// 6 9  
		// 12 15 18 
		// 

		int k = 3;
		for (int i = 0; i < 4; i++) 
		{

			for (int j = 1; j <= i+1 ; j++)
			{
				System.out.print(k);
				k=k+3;
				System.out.print("\t");
				
			}

			System.out.println();
			
			
			
		}

	}

}
