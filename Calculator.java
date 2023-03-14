public class Calculator {
  /*no instance fields as this is a simple calculator that takes new values everytime*/

  //constructor is empty as it takes no attributes
  public Calculator(){
  }
  //all methods

  //add
  public int add(int a, int b){
    return a + b;
  }
  //subtract
  public int subtract(int a, int b){
    return a - b;
  }
  //multiply
  public int multiply(int a, int b){
    return a * b;
  }
  //divide
  public int divide(int a, int b){
    return a / b;
  }
  //modulo
  public int modulo(int a, int b){
    return a % b;
  }

  //main method
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(300,43));
    System.out.println(myCalculator.divide(133,22));
    System.out.println(myCalculator.modulo(15,7));
  }
}
