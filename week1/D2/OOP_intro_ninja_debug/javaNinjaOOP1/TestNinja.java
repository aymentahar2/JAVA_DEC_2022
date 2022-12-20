public class TestNinja {
    public static void main(String[] args) {

        // Predict the Output (if there are any errors,
        // try to predict what it will say, and then fix it.)
        Ninja hikusake = new Ninja();
        System.out.println(hikusake.getName());
        String ninjaName = "Kikomo";
        Ninja kikomo = new Ninja(ninjaName);
        // kikomo.displayStats();
        kikomo.eatStrawberry();
        kikomo.eatStrawberry();
        kikomo.displayStats();

        System.out.println(Ninja.numberOfNinjas);
        // hikusake.displayStats();
        
    }
}