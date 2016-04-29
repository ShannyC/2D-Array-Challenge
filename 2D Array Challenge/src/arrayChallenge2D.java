import java.util.Scanner;

public class arrayChallenge2D
	{

		private static int i;
		private static int j;

		public static void main(String[] args)
		{
			myNumber();
			mullenHigh();
			myNumber2();
		}
		
		public static void myNumber()
			{
				int myNumber [][] = {{10,20},{30,40},{50,60},};
				System.out.println(myNumber[2][1]);	
			}
		
		public static void mullenHigh()
		{
			String  [][] mullenHigh = new String [4][3];
					for (int i = 0; i < 4; i++)
				{
					for (int j = 0; j < 3; j++)
						{
							mullenHigh[i][j] = "MHS";
						}
					
						}
					for (int i = 0; i < 4; i++)
							{
								for (int j = 0; j < 3; j++)
									{
								System.out.print(mullenHigh[i][j] + " ");
									}
									System.out.println( " ");
			
							}
		}
		
		public static void myNumber2()
		{
			int myNumber2 [][] = new int [3][3];
			int number = 0;
			for (int i = 0; i <3; i++)
				{
					for (int j = 0; j <3; j++)
						{
							number++;
							myNumber2[i][j] = number;
							System.out.print(myNumber2[i][j] + " ");
						}
					System.out.println(" "); 
				}
			int sum = myNumber2[0][0] + myNumber2[2][0] + myNumber2[0][2] + myNumber2[2][2];
			System.out.println(sum);
		}

	}
