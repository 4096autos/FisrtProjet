public class App
{
    public static void main(String []args)
    {
        System.out.println("-----------------------------------");
        // For Cat
         System.out.println("For CAT ");
         System.out.println("--------------");
        Cat miaou = new Cat("Kito", 1);
        Cat miaou2 = new Cat("Felix", 5);

        System.out.println("--------------   ----------------");
        
        // For Player
        System.out.println("For PLAYER ");
        System.out.println("--------------");
        Player p1 = new Player();
        p1.attack();

        System.out.println("-----------------------------------");
    }
}