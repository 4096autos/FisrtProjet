package com.weco;

public class App {
	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		// For Cat
		System.out.println("For CAT ");
		System.out.println("--------------");
		Cat miaou = new Cat("Kito", 1); // Instanciation de l'objet miaou
		Cat miaou2 = new Cat("Felix", 5); // Instanciation de l'objet miaou2

		System.out.println("--------------   ----------------");

		// For Player
		System.out.println("For PLAYER ");
		System.out.println("--------------");
		Player p1 = new Player();// Instanciation de l'objet p1
		p1.attack(); // Appel à la methode attack()

		System.out.println("--------------   ----------------");

		// For SoftwareRegistration
		System.out.println("For <<" + SoftwareRegistration.getNumberOfRegistration() + ">> Software Registration ");
		System.out.println("--------------");
		SoftwareRegistration sr = new SoftwareRegistration(2020);// Instanciation de l'objet p1
		System.out.println("------");
		SoftwareRegistration sr2 = new SoftwareRegistration(2022);// Instanciation de l'objet p1
		System.out.println("------");
		SoftwareRegistration sr3 = new SoftwareRegistration(2023);// Instanciation de l'objet p1
		System.out.println("Licence fini <<" + SoftwareRegistration.getNumberOfRegistration() + ">>");

		// sr.setExpirationYear(2050);// setters
		// System.out.println("Changement de date : " + sr.getExpirationYear()); //
		// getters
		System.out.println("-----------------------------------");
	}
}