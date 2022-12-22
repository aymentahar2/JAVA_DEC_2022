import java.util.ArrayList;
public class Ninja{
    // MEMBER VARIBALES
private String name ;
private int health;
private int age;
private boolean isVisible;
private Weapon ninjaWeapon;
private ArrayList<Weapon> listOfWeapons= new ArrayList<Weapon>();
// CONSTRUCTORS
public Ninja(){
    this.name = "Unknown";
    this.health = 100;
    this.age = 2200;
    this.isVisible = false;
    this.ninjaWeapon = new Weapon("Punches", 10);

}
    public Ninja(String name, int health, int age, boolean isVisible, Weapon ninjaWp){
        this.name = name;
        this.health = health;
        this.age = age;
        this.isVisible = false;
        this.ninjaWeapon = ninjaWp;
    }

    // Methods 
    public void eatStrawberry(){
        this.health +=10;
    }

    public Ninja displayStats(){
        System.out.println("Name: " + this.getName());
        System.out.println("Health:" + this.getHealth());
        System.out.println("Age:" + this.getAge());
        System.out.println("Visibility:" + this.getIsVisible());
        System.out.println("Weapon " + this.ninjaWeapon.getName());

        return this;


    }

    public void attack(Ninja enemy){
       enemy.setHealth( enemy.getHealth() - this.ninjaWeapon.getDamage());
    }

    // GETTERS & SETTERS
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int hp){
        this.age = hp;
    }

    public boolean getIsVisible(){
        return this.isVisible;
    }

    public void setIsVisible(boolean visibilty){
        this.isVisible = visibilty;
    }

}

