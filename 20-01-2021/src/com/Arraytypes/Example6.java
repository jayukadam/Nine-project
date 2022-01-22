package com.Arraytypes;
//MultiDimensional Array in one line
public class Example6 {

	public static void main(String[] args) {

	int studentIds[][] ={ {120,214}, {254,101} };	
		
for(int i=0; i<studentIds.length; i++)	
{
	for(int j=0; j<studentIds.length; j++)
	{
		System.out.println(studentIds[i][j]);
	}
}
	System.out.println("=============");
	for(int i=0; i<studentIds.length; i++)	
	{
		for(int j=0; j<studentIds.length; j++)
		{
			System.out.println(studentIds[i][j]+"\t");
		}
		System.out.println("\n\n\n\n");
	}
	/**
	 * here output is in the form of matrix that means 
	 * if [0 1] then if we take output as [1] [0]then the meanung is 
	 *    [1 0]
	 *    
	 *   first coloum and zero row 
	 *    
	 */

	System.out.println("=============");
	{
	System.out.println(studentIds[1][0]);//answer is 254
	
	}
	
	
}
		
		
		
		
		
		
		
	}


