/*
Assume you have a method isSubstringwhich checks if one word is a substring 
of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one 
call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat"). 
 */

package cracking_the_coding_interview;
import java.util.Scanner;

public class String_Rotation {

	boolean isrotate(String s1, String s2) {
		String s1s1=s1+s1;
		int len=s1.length();
		if(s2.length()==len&&len>0) {
			return s1s1.contains(s2);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				String_Rotation u=  new String_Rotation();
				System.out.println("Enter 2 string to check 2nd string is the rotation of first string");
				String s1= sc.next();				String s2= sc.next();
				System.out.println(s2+" is rotation of "+s1+"    :---   "+u.isrotate(s1,s2));
	}

}
