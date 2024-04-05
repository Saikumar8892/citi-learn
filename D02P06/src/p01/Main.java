package p01;

//Importing necessary exceptions
import java.lang.*;

//Custom exception for low balance
class LowBalanceException extends Exception {
 LowBalanceException(String s) {
     super(s);
 }
}

//Custom exception for negative amount
class NegativeAmountException extends Exception {
 NegativeAmountException(String s) {
     super(s);
 }
}

//BankAccount class
class BankAccount {
 // Member variables
 private int accNo;
 private String custName;
 private String accType;
 private float balance;

 // Constructor
 BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
     this.accNo = accNo;
     this.custName = custName;
     this.accType = accType;

     // Checking balance based on account type
     if (accType.equals("Saving") && initialBalance < 1000) {
         throw new LowBalanceException("Low Balance");
     } else if (accType.equals("Current") && initialBalance < 5000) {
         throw new LowBalanceException("Low Balance");
     }

     // Checking if initial balance is negative
     if (initialBalance < 0) {
         throw new NegativeAmountException("Negative Amount");
     }

     this.balance = initialBalance;
 }

 // Method to deposit amount
 public void deposit(float amt) throws NegativeAmountException {
     // Checking if deposit amount is negative
     if (amt < 0) {
         throw new NegativeAmountException("Negative Amount");
     }

     balance += amt;
 }

 // Method to get current balance
 public float getBalance() throws LowBalanceException {
     // Checking if balance is below minimum required balance
     if (accType.equals("Saving") && balance < 1000) {
         throw new LowBalanceException("Low Balance");
     } else if (accType.equals("Current") && balance < 5000) {
         throw new LowBalanceException("Low Balance");
     }

     return balance;
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     try {
         // Test cases
         BankAccount acc1 = new BankAccount(123, "John", "Saving", 900);
         acc1.deposit(100);
         System.out.println("Balance after deposit: " + acc1.getBalance());

         BankAccount acc2 = new BankAccount(123, "John", "Saving", -900);
     } catch (LowBalanceException e) {
         System.out.println(e.getMessage());
     } catch (NegativeAmountException e) {
         System.out.println(e.getMessage());
     }
 }
}
