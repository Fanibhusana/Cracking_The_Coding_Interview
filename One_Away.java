/*
   There are three types of edits that can be performed on strings: insert a character,remove a character, or replace a character. 
 Given two strings, write a function to check if they are one edit (or zero edits) away. 
 EXAMPLE 
 pale, ple -> true 
 pales, pale -> true 
 pale, bale -> true 
 pale, bae -> false
 */
package cracking_the_coding_interview;

import java.util.Scanner;

public class One_Away {

	public boolean edit(String first, String second) {
		// Length Checks
		if(Math.abs(first.length()-second.length())>1) return false;
		// because for edit we need only 1 or 0 more than that is not possible.
			
		//get shortest and longest string
		String s1= first.length()<second.length() ? first:second;
		String s2= first.length()<second.length() ? second:first;
		
		int index1=0, index2=0;
		boolean foundDifference= false;
		
		while(index2< s2.length() && index1<s1.length()) {
			if(s1.charAt(index1)!=s2.charAt(index2)) {
				// ensure that this is the  first difference found
				if(foundDifference) return false;
				foundDifference=true;
				
				if(s1.length()== s2.length()) index1++;// on replace, move shorter pointer
			}
			else index1++; // if matching, move shorter pointer
			index2++;// always move pointer for longer string
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		One_Away u=  new One_Away();
		System.out.println("Enter 2 strings for checking they are  edit of another or not ");
		String first= sc.next();
		String second= sc.next();

		System.out.println(second+" is edit of "+first+" :-- "+u.edit(first, second));
	}

}
