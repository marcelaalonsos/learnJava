public class Magic {
  public static void main(String[] args) {
    //original number
    int myNumber = 18;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
  }
}

// Optimized version
// public class Magic {
//   public static void main(String[] args) {
//     int myNumber = 10;
//     int magicNumber = myNumber * myNumber;
//     magicNumber += myNumber;
//     magicNumber /= myNumber;
//     magicNumber += 17;
//     magicNumber -= myNumber;
//     magicNumber /= 6;
//     System.out.println(magicNumber);
//   }
// }
