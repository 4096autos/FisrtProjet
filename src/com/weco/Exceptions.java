package com.weco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public Exceptions () {}
    
    /**
     * 
     * */
    void showExceptions() {
	Scanner sc = new Scanner(System.in);

	try {
	    System.out.println("Annee de naissance : ");
	    int yearOfBirth = sc.nextInt();
	    System.out.println(yearOfBirth + " Date correct");
	} catch (InputMismatchException e) {
	    // TODO: handle exception
	    // e.printStackTrace
	    //System.out.println("ERREUR  : " + e.getMessage());
	    System.out.println("Date de naissance incorrect");
	}
    }
}
