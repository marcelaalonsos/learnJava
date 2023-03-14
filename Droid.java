public class Droid {
  //instance fields
  int batteryLevel;
  String name;
  //constructor
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  //all methods
  //introduction
  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
  //tasks
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    int newLevel = batteryLevel - 10;
    batteryLevel = newLevel;
  }

  //energy report
  public void energyReport(){
    System.out.println(batteryLevel);
  }

  //main method
  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    Droid rosie = new Droid("Rosie");
    System.out.println(codey);
    codey.performTask("dancing");
    codey.energyReport();
  }
}
