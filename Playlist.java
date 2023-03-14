import java.util.ArrayList;

class Playlist {

  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    //add songs
    desertIslandPlaylist.add("Here comes the sun");
    desertIslandPlaylist.add("Born this way");
    desertIslandPlaylist.add("Only the good die young");
    desertIslandPlaylist.add("Rocketman");
    desertIslandPlaylist.add("Crazy little thing called love");
    desertIslandPlaylist.add("Behind blue eyes");
    desertIslandPlaylist.add("Survivor");
    desertIslandPlaylist.add("Let's get it on");


    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    //remove 3 songs
    desertIslandPlaylist.remove(5);
    desertIslandPlaylist.remove(6);
    desertIslandPlaylist.remove(2);

    System.out.println(desertIslandPlaylist.size());

    //change songs
    System.out.println(desertIslandPlaylist.indexOf("Here comes the sun"));
    System.out.println(desertIslandPlaylist.indexOf("Crazy little thing called love"));
    String songA = "Here comes the sun";
    String songB = "Crazy little thing called love";

    desertIslandPlaylist.set(0, songB);
    desertIslandPlaylist.set(3, songA);

    System.out.println(desertIslandPlaylist);
  }

}
