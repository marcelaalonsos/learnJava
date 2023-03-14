public class Store {
  //instance fields
  String productType;
  double price;

  //constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  //increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  //get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price * tax;
    return totalPrice;
  }

  //advertise method
  public void advertise() {
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");
  }

  //greetCustomer method
  public void greetCustomer(String customer){
    System.out.println("Welcome to the store, " + customer + "!");
  }

  //main method
  public static void main(String[] args){
    // lemonade stand
    Store lemonadeStand = new Store("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
    lemonadeStand.advertise();
    lemonadeStand.greetCustomer("Marcela");

    //cookie store
    Store cookieShop = new Store("cookies", 4);
  }

  //toString method
  public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";
  }
}
