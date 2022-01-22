package com.Arraytypes;

//multidimentional array
public class Example4 {
//multidimentional array in multiple line
	public static void main(String[] args) 
	{

		//declaration instantiation(An array object creation)
		
		int customerIds[][]= new int[3][3]; 
		
		customerIds[0][0] =2563;
		customerIds[0][1] =2003;
		customerIds[0][2] =2963;
		
		customerIds[1][0] =2563;
		customerIds[1][1] =2563;
		customerIds[1][2] =2563;
		
		customerIds[2][0] =2563;
		customerIds[2][1] =2563;
		customerIds[2][2] =2563;
		
		for(int i=0; i<customerIds.length; i++)
		{
			for(int j=0; j<customerIds.length; j++)
			{
				System.out.println(customerIds[i][j]);
			}
		}
			System.out.println("...............");
			
			for(int i=0; i<customerIds.length; i++)
			{
				for(int j=0; j<customerIds.length; j++)
				{
					System.out.println(customerIds[i][j]+"\t");
				}
				System.out.println("\n\n\n");
				
			}	
			
			
		
		
		
	}

}
