public class ShoppingCart {
    // MEMBER VARIABLES
    public ArrayList<String> items = new ArrayList<String>();//[]
    public String store; //null
    public double total; //0.0

    // METHOD
    public void add_item(String item, double price){
        this.items.add(item);
        this.total += price;
    }
}