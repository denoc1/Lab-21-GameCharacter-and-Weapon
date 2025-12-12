public class Player {
private String name;
private int health;
private Weapon equippedWeapon;


// Constructor
public Player(String name, int health, Weapon weapon) {
// TODO: implement defensive copy of weapon
}


// Copy constructor
public Player(Player other) {
// TODO: implement deep copy
}


// Getters
public String getName() { 
    /* TODO */ 
    }
public int getHealth() { 
    /* TODO */
     }
public Weapon getWeapon() { 
    /* TODO: return a copy */ 
     }


// Methods
public void equipWeapon(Weapon w) { 
    /* TODO: defensive copy */ 
    }
public void takeDamage(int dmg) { 
    /* TODO */ 
    }
public void attack(Player other) { 
    /* TODO */ 
    }
}