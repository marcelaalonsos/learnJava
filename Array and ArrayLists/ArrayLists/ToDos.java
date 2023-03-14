import java.util.ArrayList;

public class ToDos {

  public static void main(String[] args) {

    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    String toDo2 = "Work out";
    String toDo3 = "Wash dishes";

    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);

    System.out.println(toDoList);

    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();

    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");

    ArrayList<String> poirotsToDos = new ArrayList<String>();

    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");

    // Print the size of each ArrayList below:
    System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());

    //Print sherlock's third to-do
    System.out.println("Sherlock's third to-do:");
    System.out.println(sherlocksToDos.get(2));

    //Print Poirot's second to-do
    System.out.println("\nPoirot's second to-do:");
    System.out.println(poirotsToDos.get(1));

    // Print the name of the detective with the larger to-do list:
    System.out.println("Poirot");

     // Set each to-do below:
     sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
     poirotsToDos.set(3, "listen to Captain Hastings for amusement");

      // Remove each to-do below:
    sherlocksToDos.remove(0);
    poirotsToDos.remove(0);
    sherlocksToDos.remove(0);


     System.out.println("Sherlock's to-do list:");
     System.out.println(sherlocksToDos.toString() + "\n");
     System.out.println("Poirot's to-do list:");
     System.out.println(poirotsToDos.toString());
  }
}
