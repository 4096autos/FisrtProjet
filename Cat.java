public class Cat
{
    private String aName;// Attribut/variable membres de classe
    private int aAge;// Attribut/variable membres de classe

    public Cat(String name, int age) // Constructeur(...)
    {
        this.aName = name;
        this.aAge = age;

        System.out.println(this.aName + " - " + this.aAge);
    }
}