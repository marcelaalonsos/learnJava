public class Reservation1 {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;

  public Reservation1(int count, int capacity, boolean open){
    if (count <= 1 || count > 8){
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
    restaurantCapacity = capacity;
    isRestaurantOpen = open;
  }

  public void confirmedReservation(){
    /*
       Write conditional
       ~~~~~~~~~~~~~~~~~
       if restaurantCapacity is greater
       or equal to guestCount
       AND
       the restaurant is open:
         print "Reservation confirmed"
         set isConfirmed to true
       else:
         print "Reservation denied"
         set isConfirmed to false
    */
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
      isConfirmed = false;
    }
  }

  public void informUser(){
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant");
    } else {
    System.out.println("Please enjoy your meal!");
    }
  }

  public static void main(String[] args) {
    Reservation1 partyOfThree = new Reservation1(3, 12, true);
    Reservation1 partyOfFour = new Reservation1(4, 3, true);
    partyOfThree.confirmedReservation();
    partyOfThree.informUser();
    partyOfFour.confirmedReservation();
    partyOfFour.informUser();
  }
}
