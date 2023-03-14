import java.util.Arrays;

public class Newsfeed1 {
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0,0,0,0};
  String[] favoriteArticles;

  public Newsfeed1(){
    favoriteArticles = new String[10];
  }

  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    favoriteArticles[favoriteIndex] = newArticle;
  }

  //create getTopics()
  public String[] getTopics(){
    return topics;
  }

  public int getNumTopics(){
    return topics.length;
  }

  public String getTopTopic(){
    return topics[0];
  }

  public void viewTopic(int topicIndex){
    views[topicIndex] = views[topicIndex] + 1;
  }

  public static void main(String[] args) {
    Newsfeed1 sampleFeed = new Newsfeed1();
    sampleFeed.setFavoriteArticle(2, "Oil news");
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());

    // System.out.println("The top topic is "+ sampleFeed.getTopTopic());

    // sampleFeed.viewTopic(1);
    // sampleFeed.viewTopic(1);
    // sampleFeed.viewTopic(3);
    // sampleFeed.viewTopic(2);
    // sampleFeed.viewTopic(2);
    // sampleFeed.viewTopic(1);

    // System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
  }
}
