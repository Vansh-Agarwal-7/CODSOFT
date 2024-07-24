import java.util.Random;
import java.util.Scanner;

public class gussnumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random roam = new Random();
        int Randomnumber = roam.nextInt(100)+1;
        
        System.out.println("enter");
        int YourGuess = sc.nextInt();
        
        if(YourGuess == Randomnumber){
            System.out.print("You Won");
        }
        else if(YourGuess < Randomnumber){
            System.out.print("Your Guess Is Too Low");
        }
        else {
            System.out.print("Your Guess Is Too High");
        }
    }
}
