import java.util.ArrayList;

public class ShoppingCart {

// MEMBER VARIABLES
public ArrayList<String> items = new ArrayList<String>();
public String store;
public double total;

// public ShoopingCart ()
// Methods
public void add_item(String item, double price){
this.items.add(item)
this.total += price;
}

ShoppingCart myCart = new ShoppingCart();
myCart.add_item()
}
