import java.util.Random;
import java.util.Scanner;

public class TASK_1_Guess_The_Number { // CREATING A GAME NAMED AS "GUESS THE NUMBER"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HERE WE ARE GENERATNG THE RANDOM NUMBER
        Random no = new Random();
        int random = no.nextInt(10) + 1;

        // HERE ARE THE RULES
        System.out.println(
                "\n \n \n \n \n--------------------------------------------------------------------------------------------------------------\nA RANDOM NO.IS GENERATED BETWEEN (1-10), NOW YOU HAVE ONLY 5 CHANCES TO GUESS THE CORRECT NUMBER, AFTER EVERY CHANCE A HINT WILL ALSO BE PROVIDED FOR YOUR HELP!!!⭐️\n--------------------------------------------------------------------------------------------------------------");

        int count = 0;

        // here starts the game!!
        for (int i = 0; i < 5; i++) {
            System.out.print("\n👉Enter Your Guess (1-10):-- ");
            int playerGuess = sc.nextInt();
            count++;

            // first case
            if (playerGuess > 10) {
                System.out.println(
                        "Incorrect Attempt!! You Have To Choose Between (1-10)!! \nYou Have Also Lost A Chance");
                continue;
            }

            // main cases for the game
            if (playerGuess == random) {
                System.out.println(
                        "\n--------------------------------------------------------------------------------------------------------------\n🎉🎉 Absolutely Correct Answer, You Won!!\n            Total Attempts:-- "
                                + count
                                + "\n--------------------------------------------------------------------------------------------------------------");
                break;

            } else if (playerGuess < random) {
                System.out.println("OOPS!! Your Guess Is SMALLER Than The Actual Number!! ");
            } else {
                System.out.println("OOPS!! Your Guess Is LARGER Than The Actual Number!! ");
            }

            // another important case
            if (count == 5) {
                System.out.println(
                        "\n--------------------------------------------------------------------------------------------------------------\n😭😭YOU HAVE LOST ALL YOUR CHANCES😭😭\nThe Number Generated Was:-"
                                + " " + random
                                + "\n--------------------------------------------------------------------------------------------------------------\n\n\n");
            }
        }
    }
}
