package org.rev;

public class StringReverse {
public static void main(String[] args) {
	//String reverse
	String s="thilagavathi";
	String s1=" ";
	for(int i=s.length()-1;i>=0;i--) {
		s1=s1+s.charAt(i);
	}
	System.out.println(s1);
	boolean contains=s.contains("a");
	System.out.println(contains);
}
}
