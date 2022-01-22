package com.Arraytypes;
//single dimention array
public class Example2 {

	
	//single dimention array in multiple line
	public static void main(String[] args) {

		//declaration and instantiation(An array object creation)
		
		int customerIds[] = new int[5];
        
		//initializing 
		
		customerIds[0] = 2022;
		customerIds[1] = 5623;
		customerIds[2] = 2352;
		customerIds[3] = 2145;
		customerIds[4] = 8932;
		
		for(int i = 0; i < customerIds.length; i++)
		{
			System.out.println(customerIds[i]);
		}
		
	}

}
