public class TestNinja {


    public static void main(String[] alex){

        Ninja anonymous = new Ninja();
        Weapon sword = new Weapon("katana", 100);
        Ninja newNinja = new Ninja("Carl", 1000, 0, false,  sword );


        // anonymous.displayStats();
        // System.out.println("*********");
        // newNinja.displayStats();
        // newNinja.eatStrawberry();
        // newNinja.displayStats();
        anonymous.attack(newNinja);
        newNinja.displayStats().eatStrawberry();
        System.out.println(newNinja.getHealth());
        

        




        

    }

}