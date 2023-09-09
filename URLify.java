/*
 Write a method to replace all spaces in a string with '%20'. You may assume that the string 
has sufficient space at the end to hold the additional characters, and that you are given the "true" 
length of the string. (Note: If implementing in Java, please use a character array so that you can 
perform this operation in place.) 
EXAMPLE 
Input: "Mr John Smith ", 13 
Output: "Mr%20John%20Smith"
 */
package cracking_the_coding_interview;
public class URLify {
	 void replace(char[] st, int length) {
		 int space=0,index;
			for(int i=0;i<length;i++) {
				if(st[i]=='_') space++;
			}
			index= length+space*2;
			char[] ch= new char[index];
			if(length<st.length) st[length]='\0';
			for(int i=length-1;i>=0;i--) {
				if(st[i]=='_') {
					ch[index-1]='0';
					ch[index-2]='2';
					ch[index-3]='%';
					index=index-3;
				}
				else {
					ch[index-1]=st[i];
					index--;
				}
			}
			System.out.println(ch);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URLify ur=new URLify();
		String string="fa_ni";
		System.out.println(string);
		int l=5;
		char[] ch=string.toCharArray();
		ur.replace(ch,l);
	}

}
