 /*
   Given two strings, write a method to decide if one is a permutation of the other.
 
 God is a permutation of dog.
 */
package cracking_the_coding_interview;
import java.util.Scanner;

public class check_permutation {
	String sort(String s) {
		char[] ch= s.toCharArray();
		java.util.Arrays.sort(ch);
		return new String(ch);
	}
	public boolean permu(String s1, String s2) {
		if(s1.length()!= s2.length()) return false;
		return s1.equals(s2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check_permutation permutation=new check_permutation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 string for checking bort are permutation of eachother or not");
		String s= sc.next();
		String st= sc.next();
		s= permutation.sort(s);
		st= permutation.sort(st);
		System.out.println("Both string are Permutation :---   "+permutation.permu(s,st));
	}

}

