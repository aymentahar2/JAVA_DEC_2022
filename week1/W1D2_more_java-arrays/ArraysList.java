import java.util.Arrays;
import java.util.ArrayList;

public class ArraysList{

    public static void main(String[] args){

        // System.out.println("Test !!");
        // --- ARRAYS ---
        // primitive

        int[] myArray;  // declaration 
        myArray = new int[5];    // Initialization => [0, 0, 0, 0, 0]
        String name; // null
        int x; // 0
        double y; // 0.0
        //--------------
        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 8;
        myArray[3] = 5;
        myArray[4] = 9;
        // for (int i = 0; i < myArray.length; i++){
        //     System.out.println(myArray[i]);
        // }
        System.out.println(Arrays.toString(myArray));
        // -----------
        String [] names = {"bob", "jenney", "Louis"};
        System.out.println(Arrays.toString(names));

        // === DYNAMIC ARRAYS === 
        ArrayList <String> people = new ArrayList<>();
        System.out.println(people); // ? []

        // people[0] = "bob"; // XXX error
        //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html 
        // Always a good habit to check the docs
        people.add("Bob");
        people.add("Jenney");
        people.add("Edwardo");
        System.out.println(people);
        boolean didRemove = people.remove("Bob");
        System.out.println(people);
        System.out.println(didRemove);

        for (int i = 0 ; i<people.size(); i++){
            System.out.println(people.get(i));
            // String aName = people.get(i);
            // System.out.println(aName + " isAwesome");
            people.set(i, people.get(i) + " is awesome") ;
        }
        System.out.println(people);

        // === Enhanced Loop ===

        for (String someName: people){
            System.out.println(someName); 
        }
    }
}