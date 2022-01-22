package com.Arraytypes;

public class Example5 {
//single dimensional array in multiple lines
	
	public static void main(String[] args) {
int studentIds[]= new int[5];

studentIds[0] = 10;
studentIds[1] =23;
studentIds[2]= 41;
studentIds[3]= 45;
studentIds[4]= 25;
		
for(int i=0; i<studentIds.length; i++)
{
	System.out.println(studentIds[i]);
}
	System.out.println("============");	
		System.out.println(studentIds[2]);
		
	}

}
