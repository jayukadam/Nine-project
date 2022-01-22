package com.Arraytypes;

public class Example7 {

	public static void main(String[] args) {

		int studentIds[][]=new int [2][2];
		studentIds[0][0] = 120;
		studentIds[0][1] = 130;
		
		studentIds[1][0] = 140;
		studentIds[1][1] = 150;
		
		for(int i=0; i<studentIds.length; i++)
		{
			for(int j=0; j<studentIds.length; j++)
			{
				System.out.println(studentIds[i][j]);
			}
			System.out.println("=============");
			System.out.println(studentIds[0][1]);
		}
		System.out.println("=================");
		for(int i=0; i<studentIds.length; i++)
		{
			for(int j=0; j<studentIds.length; j++)
			{
				System.out.println(studentIds[i][j]+"\t");
			}
			System.out.println("\n\n\n\n");
		}
		
		
		
		
		
	}

}
