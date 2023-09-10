/*
Implement an algorithm to determine if a string has all unique characters. 
What if you cannot use additional data structures?



here we take  ASCII  code so we take 128
 */

package cracking_the_coding_interview;
import java.util.Scanner;
public class is_unique {
	public boolean  unique(String string) {
		if(string.length()>128)  return false;
		
		boolean[] ch=new boolean[128]; 
		for(int i=0;i<string.length();i++) {
			int val=string.charAt(i);
			if(ch[val]) return false;
				ch[val]=true;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		is_unique u=  new is_unique();
		System.out.println("Enter the string for checking all character are unique or not");
		String string= sc.next();
		System.out.println("This string conatin unique character :---   "+u.unique(string));
	}

}
