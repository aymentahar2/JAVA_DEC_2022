import java.util.Date;


class Greeting {

    public String getCurrentDate(){
        Date date = new Date();

        return "Current date is " + date;
    }


    public String greetingEnglish(String name){
        return "Hello " + name;
    }


    public String greetingSpanish(String name){
        return "Hola " + name;
    }

}