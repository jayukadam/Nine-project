package com.Arraytypes;

public class Example3 {

	/**
	 * 2. Multidimentional Array:
	 * @param args
	 */
	public static void main(String[] args) 
	{
        //Multidimentional Array in one line
		
		//declaration, instantiation and initialization of an array in one line
		
	int	customerIds[][] = {{2356,1452}, {1236,5632}};//2*2 =4
		
		for(int i =0; i<customerIds.length; i++)
		{
			for(int j=0; j<customerIds.length; j++)
			{
				System.out.println(customerIds[i][j]);
			}
		}
		System.out.println(".............");
		for(int i =0; i<customerIds.length; i++)
		{
			for(int j=0; j<customerIds.length; j++)
			{
				System.out.println(customerIds[i][j]+"\t");
			}
			System.out.println("\n\n\n\n");
		}	
	}

}
