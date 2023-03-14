public class SavingsAccountReview {
  int balance;

  public SavingsAccountReview(int initialBalance){
    balance = initialBalance;
  }

  //check balance method
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  //deposit method
  public void deposit(int amountToDeposit){
    int newBalance = balance + amountToDeposit;
    balance = newBalance;
    System.out.println("You just deposited " + amountToDeposit);
  }

  //withdraw method
  public int withdraw(int amountToWithdraw){
    int minusBalance = balance - amountToWithdraw;
    balance = minusBalance;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }

  public static void main(String[] args){
    SavingsAccountReview savings = new SavingsAccountReview(2000);

    //Check balance:
    savings.checkBalance();

    //Withdrawing:
    savings.withdraw(100);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(300);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(100);

    //Check balance:
    savings.checkBalance();
  }
}
