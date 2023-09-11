/*
Implement a method to perform basic string compression using the counts 
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the 
"compressed" string would not become smaller than the original string, your method should return 
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
*/
package cracking_the_coding_interview;
import java.util.Scanner;

import javax.naming.ldap.StartTlsRequest;// this import is most important

public class String_Compression {

	public String compression(String str) {
		String string="";
		int count=0;
		for(int i=0;i<str.length();i++) {
			count++;
			
			// if next character is differ than current, append this  char to result;
			if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)) {
				string+=""+str.charAt(i)+count;
				count=0;
			}
		}
		return string.length()>str.length()?string:str; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String_Compression u=  new String_Compression();
		System.out.println("Eneter the string for compression");
		String string= sc.next();
		System.out.println("This string conatin unique character :---   "+u.compression(string));
	}

}
