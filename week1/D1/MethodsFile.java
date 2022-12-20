class MethodsFile {

//Access Modifier 
   // |  Return Type 
   // |     |  Method name + Parameter Type 
   // |     |    |( Method Signature )| 
   // V     V    |---------V---------|         
    public String greeter(String name){
        //Method Body

        return "Hello " + name;
    }

    // OVERLOADING
    public String greeter(String name, int ticketNum){
        return "Hello " + name + " your number is " + ticketNum ;
    }
}