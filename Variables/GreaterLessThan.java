public class GreaterLessThan {
  public static void main(String[] args) {
    double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    boolean enoughCredits = creditsEarned > creditsToGraduate;
    System.out.println(enoughCredits);
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    boolean canGraduate = creditsToGraduate < creditsAfterSeminar;
    System.out.println(canGraduate);
  }
}
