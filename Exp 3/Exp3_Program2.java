public class Exp3_Program2 {
    private String name;
    private int age;
    private String country;

    public Exp3_Program2(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Country: " + country;
    }
}

class cricketExp3_Program2 extends Exp3_Program2 {
    private String type;
    private int matches;

    public cricketExp3_Program2(String name, int age, String country, String type, int matches) {
        super(name, age, country);
        this.type = type;
        this.matches = matches;
    }

    public String toString() {
        return super.toString() + ", Type: " + type + ", Matches: " + matches;
    }
}

class hockeyExp3_Program2 extends Exp3_Program2 {
    private String type;
    private int matches;

    public hockeyExp3_Program2(String name, int age, String country, String type, int matches) {
        super(name, age, country);
        this.type = type;
        this.matches = matches;
    }

    public String toString() {
        return super.toString() + ", Type: " + type + ", Matches: " + matches;
    }
}

class footballExp3_Program2 extends Exp3_Program2 {
    private String type;
    private int matches;

    public footballExp3_Program2(String name, int age, String country, String type, int matches) {
        super(name, age, country);
        this.type = type;
        this.matches = matches;
    }

    public String toString() {
        return super.toString() + ", Type: " + type + ", Matches: " + matches;
    }
}

class Main {
    public static void main(String[] args) {
        cricketExp3_Program2 c = new cricketExp3_Program2("MS Dhoni", 39, "India", "Batsman", 100);
        hockeyExp3_Program2 h = new hockeyExp3_Program2("Dhan Chand", 40, "India", "Defender", 50);
        footballExp3_Program2 f = new footballExp3_Program2("Messi", 33, "gentina", "Forward", 150);

        System.out.println(c);
        System.out.println(h);
        System.out.println(f);
    }
}