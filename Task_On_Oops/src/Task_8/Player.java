package Task_8;

// Encapsulation Concept--------------------

public class Player {
    private String name;
    private int age;
    private String game;
    
    // Constructor
    public Player(String name, int age, String game) {
        this.name = name;
        this.age = age;
        this.game = game;
    }

    // Getter Method
    public String getName() {
        return name;
    }

    public int getAge() {
    	return age;
    }
    
    public String getGame() {
    	return game;
    }
    
    // Setter Method
    public void setName(String name) {
        this.name = name;
    }

   
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setGame(String game) {
    	this.game = game;
    }

    
    public static void main(String[] args) {
        // Create a Player object
        Player player = new Player("Rohit Sharma", 29, "Cricket");

        // Access and modify fields using getter and setter methods
        System.out.println("Player Name: " + player.getName());
        System.out.println("Player Age: " + player.getAge());
        System.out.println("Player Game: " + player.getGame());
    }
}
