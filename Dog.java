public class Dog {
  //instance field
  String breed;
  int age;
  boolean hasOwner;

  //constructor method
  public Dog(String dogBreed, int dogYears, boolean dogOwned) {
    /*
     value of parameter dogBreed
     assigned to instance field breed
     */
    System.out.println("Constructor invoked");
    breed = dogBreed;
    age = dogYears;
    hasOwner = dogOwned;
  }
  public static void main(String[] args) {
    /*
     create instance:
     use 'new' operator and invoke constructor
     */
    System.out.println("Main method started");
    Dog fido = new Dog("poodle", 5, false);
    Dog cosmo = new Dog("pug", 10, true);
    int totalDogYears = fido.age + cosmo.age;
    /*
     fields are accessed using:
     the instance name, '.' operator, and the field name
     */
    System.out.println(fido.breed);
    System.out.println(cosmo.age);
    System.out.println("Cosmo and fido have a total of " + totalDogYears + " years together!");
    //"poodle"
  }
}
