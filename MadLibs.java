public class MadLibs {
  /*This program generates a mad libbed story
    Author: Marcela Alonso
    Date: 3/13/2023
   */
  public static void main(String[] args) {
    String name1;
    name1 = "Marcela";
    String adjective1;
    adjective1 = "okay";
    String adjective2;
    adjective2 = "okay";
    String adjective3;
    adjective3 = "okay";
    String verb1;
    verb1 = "run";
    String noun1;
    noun1 = "sleep";
    String noun2;
    noun2 = "think";
    String noun3;
    noun3 = "cry";
    String noun4;
    noun4 = "eat";
    String noun5;
    noun5 = "drink";
    String noun6;
    noun6 = "jump";
    String name2;
    name2 = "Barbara";
    int number = 4;
    String place1 = "Brooklyn";


    //the template for the story
    String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
    System.out.println(story);
  }
}
