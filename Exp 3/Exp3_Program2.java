class Player
{
    String name;
    int age;
    Player(String n, int a)
    {
        name = n;
        age = a;
    }
    void show()
    {
        System.out.println("Player name: " + name);
        System.out.println("Age: " + age);
    }
}
class cricket_player extends Player
{
    String type;
    cricket_player(String n, String t, int a)
    {
        super(n, a);
        type = t;
    }
    public void show()
    {
        super.show();
        System.out.println("Player type : " + type);
    }
}
class football_player extends Player
{
    String type;
    football_player(String n, String t, int a)
    {
        super(n, a);
        type = t;
    }
    public void show()
    {
        super.show();
        System.out.println("Player type : " + type);
    }
}
class hockey_player extends Player
{
    String type;
    hockey_player(String n, String t, int a)
    {
        super(n, a);
        type = t;
    }
    public void show()
    {
        super.show();
        System.out.println("Player type : " + type);
    }
}
public class Exp3_Program2
{
    public static void main(String[] args)
    {
        cricket_player c = new cricket_player("Sachin", "Batsman", 40);
        football_player f = new football_player("Ronaldo", "Striker", 35);
        hockey_player h = new hockey_player("Dhyan Chand", "Forward", 100);
        c.show();
        f.show();
        h.show();
    }
}