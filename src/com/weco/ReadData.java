package com.weco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadData {
    public ReadData() throws IOException{
	
    }
    
    /**
     *Show Readers <pre></pre>
     *	BufferredReader | 	Scanner <br>
     */
    void showRead() throws IOException {
	System.out.println("-----------------------------------");
	System.out.println("For ReadData");
	System.out.println("--------------   ----------------");
	readBufferredReader();
	readScanner();
	System.out.println("--------------   ----------------");
	System.out.println("Merci - Have A good Game ");
	System.out.println("-----------------------------------");

    }
    
    /**
     * BufferredReader <pre></pre> 
     *		fast for string only  synchrone <br>
     *		thread-safe | lecture de String <br>
     *		tampon de 8192 caracteres <br>
     *		- read() 		: lire un caractere <br> 
     *		- readLine() 	: line une chaine <br>
     *		- skip(N) 	: ignore (N) carateres 	<br>	
     */
    void readBufferredReader() throws IOException {
	System.out.println("--------------BufferredReader");

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	System.out.println("Comment t'appelles-tu ? ");
	String name = br.readLine();

	System.out.println("Bonjour " + name);
    }
    
    /**
     *	Scanner <pre></pre>
     *		check dataType asynchrone <br>
     *		not thread-safe <br>
     *		lecture de donnee + parsing <br>
     *		tampon de 1024 caracteres <br> 
     */
    void readScanner() {
	System.out.println("--------------Scanner");

	Scanner sc = new Scanner(System.in);

	System.out.println("Acceder a quel niveau ? ");
	int game_level = sc.nextInt();

	System.out.println("Niveau " + game_level + "\n" + "Un bon niveau");
    }
}
