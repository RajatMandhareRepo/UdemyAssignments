package Programs;

public class pattern2 {

	public static void main(String[] args) {

		// 1   
		// 1 2  
		// 1 2 3 
		// 1 2 3 4

		for (int i = 0; i < 4; i++) 
		{

			for (int j = 1; j <= i+1 ; j++)
			{
				System.out.print(j);
				
				System.out.print("\t");
				
			}

			System.out.println();
			
			
			
		}

	}

}
