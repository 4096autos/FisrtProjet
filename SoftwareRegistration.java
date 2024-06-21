public class SoftwareRegistration
{	
	public SoftwareRegistration (int expiration)
	{
		this.aExpirationYear = expiration;
		System.out.println("Enregistrement du produit, valide jusqu'en " + this.aExpirationYear);
	}
    // Attributs
    private int aExpirationYear;
	/*
		[ACCESSEURS]
			getters : accès à un attribut (lecture)
			setters	: modification d'un attribut
	*/
    public int getExpirationYear(){ return this.aExpirationYear;} //[ACCESSEURS : Getter]
    public void setExpirationYear(int expiration){ this.aExpirationYear = expiration;} //[ACCESSEURS : setter]
}