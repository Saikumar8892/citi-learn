package p02;

//Importing necessary exceptions
import java.lang.*;

//Custom exception for not eligible players
class NotEligibleException extends Exception {
 NotEligibleException(String s) {
     super(s);
 }
}

//CricketRating class
class CricketRating {
 // Member variables
 private String playerName;
 private float critic1;
 private float critic2;
 private float critic3;
 private float avgRating;
 private String coins;

 // Constructor for two critics
 CricketRating(String playerName, float critic1) {
     this.playerName = playerName;
     this.critic1 = critic1;
     this.critic2 = critic2;
     calculateAverageRating(critic1, critic2);
     calculateCoins();
 }

 // Constructor for three critics
 CricketRating(String playerName, float critic1, float critic2, float critic3) {
     this.playerName = playerName;
     this.critic1 = critic1;
     this.critic2 = critic2;
     this.critic3 = critic3;
     calculateAverageRating(critic1, critic2, critic3);
     calculateCoins();
 }

 // Method to calculate average rating based on two critics
 private void calculateAverageRating(float critic1, float critic2) {
     avgRating = (critic1 + critic2) / 2;
 }

 // Method to calculate average rating based on three critics
 private void calculateAverageRating(float critic1, float critic2, float critic3) {
     avgRating = (critic1 + critic2 + critic3) / 3;
 }

 // Method to calculate coins based on average rating
 private void calculateCoins() {
     if (avgRating >= 7) {
         coins = "Gold";
     } else if (avgRating >= 5 && avgRating < 7) {
         coins = "Silver";
     } else if (avgRating >= 2 && avgRating < 5) {
         coins = "Copper";
     } else {
         coins = "NotEligible";
     }
 }

 // Method to display information
 public void display() {
     System.out.println(playerName + " " + avgRating + " " + coins);
 }
}

//Tester class
public class main {
 public static void main(String[] args) throws NotEligibleException {
     // Test cases
	 CricketRating player1 = new CricketRating("John", 9.3f, 9.67f, 8.7f);
	 player1.display();

	 CricketRating player2 = new CricketRating("Henry", 1.5f);
	 player2.display();
 }
}
