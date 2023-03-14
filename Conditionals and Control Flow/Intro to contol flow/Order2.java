public class Order2 {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;

  public Order2(boolean filled, double cost, String shippingMethod, String coupon){
    if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
  }

  public void ship(){
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }

  public double calculateShipping(){
    	 	// declare conditional statement here
         if (shipping == "Regular") {
          return 0;
        } else if (shipping == "Express") {
          // return 1.75;
          if (couponCode == "ship50") {
            return .85;
          } else {
            return 1.75;
          }
        } else {
          return .50;
        }
  }

  public static void main(String[] args) {
    Order2 book = new Order2(true, 9.99, "Express", "ship50");
    Order2 chemistrySet = new Order2(false, 72.50, "Regular", "freeShipping");

    book.ship();
    chemistrySet.ship();
  }
}
