package com.weco;

public class SoftwareRegistration {
	public SoftwareRegistration(int expiration) {
		if (aNumberOfRegistration > 0) {
			this.aExpirationYear = expiration;
			aNumberOfRegistration--;

			System.out.println("Logiciel valide (Expiration : " + this.aExpirationYear + ")");
			System.out.println("Enregistrement restant : " + this.aNumberOfRegistration);
		} else {
			System.out.println("Maximum de validation effectuees !");
		}
	}

	// Attributs
	private int aExpirationYear;

	/*
	 * [ACCESSEURS] getters : accès à un attribut (lecture) setters : modification
	 * d'un attribut
	 */
	// public int getExpirationYear(){ return this.aExpirationYear;} //[ACCESSEURS :
	// Getter]
	// public void setExpirationYear(int expiration){ this.aExpirationYear =
	// expiration;} //[ACCESSEURS : setter]
	public static int getNumberOfRegistration() {
		return aNumberOfRegistration;
	} // [ACCESSEURS : Getter]

	// Variable de Classe
	private static int aNumberOfRegistration = 2;
}