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
	boolean contains=s.contains("t");String[] args2 = new String[args.length + 1];
	System.arraycopy(args, 0, args2, 0, args.length);
	args2[args.length] = s1;
	System.out.println(contains);
}
}
