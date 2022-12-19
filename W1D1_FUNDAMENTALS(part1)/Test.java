public class Test {

    // entry point to compile
    // everything will be executed in here
    
    public static void main(String[] args){
        // System.out.println("hello ninjas !");

        // VARIABLES
        // primitives

        int x = 3;
        boolean vote = true;
        double tax = 3.4;
        float xx = 3.4f;
        char letter = 'a';
        // System.out.println(xx);

        // Object Types (Class Wrappers)
        Integer y = 215498;
        String name = "Mike";
        Boolean isAdmin = true;
        Double pie = 3.14;


        // ---- STRING ----
        String a = "my name is Bob";
        String b = "her name is Julia \n";
        // System.out.println(b.length());
        // System.out.println(b.concat(a));

        // ----- args ------
            // System.out.print(args[0]);    


        // METHODES
        MethodsFile otherFile = new MethodsFile();
        // System.out.println(otherFile.greeter("Lex"));

        // System.out.println(otherFile.greeter("Lex", 7));

        // Dependency injection
        Greeting greeterApp = new Greeting();
        String dateMessage = greeterApp.getCurrentDate();
        System.out.println(dateMessage);

            }
}

// 