package com.Array;

public class Example1 {

/**
 * Array:- array is derived data type used to store multiple value of 
 * similar or homogeneus data value/elements. 
 */
		public static void main(String[] args) {
			/**
			 * write a java program to print employee age using java array 
		*/

 int employeeAges[] = {20,23,25,12,15};
 System.out.println("Element count in an array: " +employeeAges.length);
 System.out.println("............");
 
 //how to print value of an array
 /**
  * NOTE:in java an array works based index concept so array start from 0
  * (zero) & ends at lenght-1 or size-1
  */
		for(int i=0; i<employeeAges.length; i++)
		{
			System.out.println(employeeAges[i]);
		}
		
		System.out.println("...........");
		System.out.println(employeeAges[4]);
	}

}
