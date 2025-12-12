public class Weapon {
    private String name;
    private int damage;
    private int durability; 

    // Constructor
    /**Constructor to create a new Weapon
        * Precondions - name is non-null
        *             - damage >= 0
        *             - durability >= 0
        * Postconditions - creates a new Weaon with given attributes
    */ 
    public Weapon(String name, int damage, int durability) {
    // TODO: implement
    }


    // Copy constructor
        /**Constructor to create a Weapon identical to other
        *   Precondions - other !-null
        *   Postconditions - A new Weapon object exists with the same name, damage, and durability as other
    */ 
    public Weapon(Weapon other) {
    // TODO: implement
    }


    // Getters
    /** Returns the name of the weapon
     *  Postcondition - Returns the name of type String
     */
    public String getName() { 
        /* TODO */
    }

    
    /** Returns the damage value of the weapon
     *  Postcondition - Returns the damage, of type int
     */
    public int getDamage() {
        /* TODO */ 
    }

    /** Returns the durability value of the weapon
     *  Postcondition - Returns the durability of type int
     */
    public int getDurability() { 
        /* TODO */
    }


    // Methods
    /** Reduces durability by amount
     * Precondition - amount >= 0
     *  Postcondition - durability is reduced by amount, minimum 0
    public void weaken(int amount) { 
        /* TODO */ 
    }

     /** Checks if weapon is broken
     *  Returns true if durability <= 0, else false
    public boolean isBroken() {
        /* TODO */
    }
}