package com.weco;

import java.util.StringTokenizer;

public class Stringg {
    public Stringg() {
    }

    /**
     *
     * Show Strings
     * 
     * <pre></pre>
     * 
     * showString1() <br>
     * showString2() <br>
     * showString3() <br>
     */
    void showStrings() {
	System.out.println("-----------------------------------");
	System.out.println("For Strings");
	System.out.println("--------------   ----------------");
	showString1();
	showString2();
	showString3();
	System.out.println("--------------   ----------------");
	System.out.println("-----------------------------------");
    }

    /**
     *
     * Test de Methodes sur String
     * 
     * <pre>
     *String : immuable (UnEdit) 
     *concat() rapide que "+" 
     *length() , toUpperCase(),
     *toLowerCase(), trim(),
     *replace("old","new")
     *charAt("index")
     *substring("index", "nb")
     *equals("str"), compareTo("str")
     * </pre>
     */
    void showString1() {
	System.out.println("--------------String 1");

	String s = "TOTO";
	String s2 = "toto";

	System.out.println("--------------1\n" + "Concat with + \n " + s + " " + s2);
	System.out.println("--------------2 \n" + "concat() \n " + s.concat(" ").concat(s2));
	System.out.println("--------------3 \n" + "length() \n " + s.length());
	System.out.println("--------------4 \n" + "toUpperCase() \n " + s.toUpperCase());
	System.out.println("--------------5 \n" + "toLowerCase() \n" + s.toLowerCase());
	System.out.println("--------------6\n" + "trim() \n" + s.trim());
	System.out.println("--------------7\n" + "replace(O, I) \n" + s.replace("O", "I"));
	System.out.println("--------------8 \n" + "charAt(0) \n" + s.charAt(3));
	System.out.println("--------------9 \n" + "substring(0, 3) \n" + s.substring(0, 3));
	System.out.println("--------------10 \n" + "equals(s2) \n" + s.equals(s2));
	System.out.println("--------------11\n" + "compareTo(s2) \n" + s.compareTo(s2));
    }

    /**
     * Tokenizer : Example
     * 
     * <pre></pre>
     * 
     * StringTokenizer st = new StringTokenizer(s, "/", true);<br>
     */
    void showString2() {

	System.out.println("--------------String 2");

	String s = "news/titre-de-la-news/14";
	StringTokenizer st = new StringTokenizer(s, "/", true);
	while (st.hasMoreTokens())
	    System.out.println(st.nextToken());
    }

    /**
     * StringBuilder VS StringBuffer <br>
     * 
     * <pre></pre>
     * 
     * StringBuilder(asynchrone) Monothreading : 1 seul thread <br>
     * StringBuffer(synchronisé, thread-safe) Multi-treading : plusieurs threads
     * <br>
     * <br>
     * >length(), capacity(), append("str"), insert("index", "str") <br>
     */
    void showString3() {

	System.out.println("--------------String 3");

	StringBuffer sBuffer = new StringBuffer();

	sBuffer.append(" tout le monde");
	System.out.println(sBuffer);

	sBuffer.insert(0, "Bonjour");
	System.out.println(sBuffer);
    }
}
