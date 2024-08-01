import java.util.Scanner;

public class TASK_2_Grade_Calculator { // CREATING GRADE CALCULATOR
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HERE WE ARE TAKING THE INPUTS
        System.out.print(
                "\n\n\n\nEnter Your PHYSICS' Marks:-- ");
        int PHYSICS = sc.nextInt();

        System.out.print("Enter Your CHEMISTRY Marks:-- ");
        int CHEMISTRY = sc.nextInt();

        System.out.print("Enter Your MATHS' Marks:-- ");
        int MATHS = sc.nextInt();

        System.out.print(
                "\n\n--------------------------------------------------------------------------------------------------------------");

        int sum = PHYSICS + CHEMISTRY + MATHS;
        Float percentage=(float)(PHYSICS + CHEMISTRY + MATHS)/3;

        // HERE WE ARE CALCULATING THE TOTAL MARKS
        System.out.println("\nTotal Marks Obtained:-- " + sum+"/300");

        // HERE WE ARE CALCULATING THE PERCENTAGE
        System.out.println("Total Percentage Obtained:-- "+percentage+"%");

        // HERE WE ARE CALCULATING THE GRADE
        if (percentage>85) {
            System.out.println("Grade Obtained:-- A");

        }else if (percentage>70 && percentage<86) {
            System.out.println("Grade Obtained:-- B");
            
        }else if (percentage>45 && percentage<71) {
            System.out.println("Grade Obtained:-- C");
            
        }else if (percentage>32 && percentage<46) {
            System.out.println("Grade Obtained:-- D");
        }else{
            System.out.println("Grade Obtained:-- FAIL");
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
    }
}
