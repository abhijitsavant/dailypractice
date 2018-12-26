package com.java.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) throws IOException {

		String content = new String(Files.readAllBytes(Paths.get("j:/Test.txt")));
		System.out.println(content);
		String str = "hello font-size:90pt; fgfg font-size:0pt;";
		String regex = "font-size:+\\s\\d+pt;";
		//String regex = "font-size:+\\s\\d+pt;";
		//String regex = "font-size:+\\d+pt;"; //working
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(content);
		StringBuilder sBuilder = new StringBuilder() ;
		if (m.find()) {
			//System.out.println("true : " + m.replaceAll("test"));
			sBuilder.append(m.replaceAll("font-size:100pt;"));
		}
		System.out.println("end");
		System.out.println("Final String : "+sBuilder.toString());
		//String regex = "^(font-size).[0-9]*.pt;$";
		//String regex = "(?:font-size+)(\\\\d+)(?:pt;)$";
		//String regex = "(font)(-)(size)(:)(9)(pt)(;)";
		
		//^(maze[0-9]*\.in)\.txt$
		//"(.*)font[a-b]|[0-9]pt;"
		
		
		/*String txt="hello font-size:90pt; test font-size:9pt;";

	    String re1=".*?";	// Non-greedy match on filler
	    String re2="(font)";	// Word 1
	    String re3="(-)";	// Any Single Character 1
	    String re4="(size)";	// Word 2
	    String re5="(:)";	// Any Single Character 2
	    String re6="(\\d+)";	// Integer Number 1
	    String re7="(pt)";	// Word 3
	    String re8="(;)";	// Any Single Character 3

	    Pattern p = Pattern.compile(re1+re2+re3+re4+re5+re6+re7+re8,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	    Matcher m = p.matcher(txt);
	    if (m.find())
	    {
	    	System.out.println("test");
	    	//System.out.println(m.replaceFirst("AAA"));
	    	
	    }
	    if (m.find())
	    {
	        String word1=m.group(1);
	        String c1=m.group(2);
	        String word2=m.group(3);
	        String c2=m.group(4);
	        String int1=m.group(5);
	        String word3=m.group(6);
	        String c3=m.group(7);
	        System.out.print("("+word1.toString()+")"+"("+c1.toString()+")"+"("+word2.toString()+")"+"("+c2.toString()+")"+"("+int1.toString()+")"+"("+word3.toString()+")"+"("+c3.toString()+")"+"\n");
	    }*/
	}

}
