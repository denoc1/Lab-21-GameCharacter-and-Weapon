public class Player {
private String name;
private int health;
private Weapon equippedWeapon;


// Constructor
/**Constructor to create a new Player with a Weapon
        * Precondions - name != null
        *             - health >= 0
        *             - weapon != null
        * Postconditions - Creates a new Player with defensive copy of Weapon
public Player(String name, int health, Weapon weapon) {
// TODO: implement defensive copy of weapon
}


// Copy constructor
/**Constructor to creates a  new Player identical to other
        * Precondions - other != null
        * Postconditions -A new Player object exists with copied name, health, and weapon (deep copy)
public Player(Player other) {
// TODO: implement deep copy
}


// Getters
/** Returns the name of the Player
 *  Postcondition - Returns the name of type String
 *  */
public String getName() { 
    /* TODO */ 
    }

/** Returns the Player's health
*   Postcondition - Returns the health of type integer
*/
public int getHealth() { 
    /* TODO */
     }

/** Returns a copy of Player's Weapon
*  Postcondition - Returns a new Weapon object identical to the equipped weapon
*/
public Weapon getWeapon() { 
    /* TODO: return a copy */ 
     }


// Methods

/** Equip a new weapon
* Precondition - w != null
*  Postcondition - Player now has a copy of weapon w as their equippedWeapon
*/
public void equipWeapon(Weapon w) { 
    /* TODO: defensive copy */ 
    }

/** Reduces the Player's health by dmg
* Precondition - dmg >= 0
*  Postcondition - health reduced by dmg, minimum 0
*/
public void takeDamage(int dmg) { 
    /* TODO */ 
    }


/** Attacks another Player using this Player’s weapon
* Precondition - other != null, 
*              - weapon not broken
*  Postcondition - other.health reduced by weapon damage, this Player’s weapon durability decreased by 1
*/    
public void attack(Player other) { 
    /* TODO */ 
    }
}