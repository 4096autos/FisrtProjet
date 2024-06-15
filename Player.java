public class Player
{
    private String aName;// Attribut/variable membres de classe
    private int aLevel;// Attribut/variable membres de classe

    public Player() // Constructeur(...)
    {
        this.aName = "Inconnu";
        this.aLevel = 1;
        System.out.println(this.aName + " : " + " L " + this.aLevel);
    }

    public void attack() // Methode attack()
    {
        System.out.println(this.aName + " attaque un cible !");
    }

}