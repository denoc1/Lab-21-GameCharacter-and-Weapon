# Lab-21-Battle Arena
## Overview

Welcome to **BattleArena**, where you will design two classes: `Player` and `Weapon`. This project reinforces key Java concepts:

* Objects as instance variables (composition)
* Passing objects as parameters
* Returning objects
* Defensive copying / copy constructors
* Aliasing and reference behavior

In this game-themed project, a Player **has a** Weapon and can attack other Players.

---

## Project Requirements

### **Weapon Class**

* Private instance variables:

  * `String name`
  * `int damage`
  * `int durability`
* Methods to implement:

  * Constructor: `Weapon(String name, int damage, int durability)`
  * Copy constructor: `Weapon(Weapon other)`
  * Getters: `getName()`, `getDamage()`, `getDurability()`
  * `void weaken(int amount)`
  * `boolean isBroken()`

### **Player Class**

* Private instance variables:

  * `String name`
  * `int health`
  * `Weapon equippedWeapon`
* Methods to implement:

  * Constructor: `Player(String name, int health, Weapon weapon)` (defensively copies the weapon)
  * Copy constructor: `Player(Player other)` (deep copy)
  * Getters: `getName()`, `getHealth()`, `getWeapon()` (returns a copy)
  * `void equipWeapon(Weapon w)` (defensively copies)
  * `void takeDamage(int dmg)`
  * `void attack(Player other)`

---

## Getting Started

1. Complete each TODO in `Weapon.java` and `Player.java`.
2. Run `Lab21GamePlay.java` to test your implementation.
3. Verify output and defensive copying by reading the console.

---


**Expected Output Example:**

```
Bran health: 90
Aria weapon durability: 19
Original weapon durability after external weaken: 19
```

---

## Optional Stretch Tasks

1. Allow multiple Players to share the same Weapon reference and explore side effects.
2. Implement a `repair()` method in `Weapon` to restore durability.
3. Add attack bonuses or special effects for weapons.

---

## Tips

* Always copy mutable objects when storing or returning them to avoid aliasing issues.
* Test your code using the provided tester, but feel free to add your own tests.
* Carefully consider the effect of multiple references to the same Weapon obj
