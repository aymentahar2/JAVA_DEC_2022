public class Weapon{

    // MEMBER VARIABLES
    private String name;
    private int damage;

    public Weapon(String  weaponName, int dmg){
        this.name = weaponName;
        this.damage = dmg;
    }

    // GETTERS & SETTERS

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public int getDamage(){
        return this.damage;
    }

    public void setDamage(int damageValue){
        this.damage = damageValue;
    }
}