import java.util.Scanner;

public class TASK_3_ATM_Interface {// CREATING ATM INTERFACE USING
                    // OOPS-----------------------------------------------
    public static void main(String[] args) {
        Atm a1 = new Atm();
        a1.checkPin();
    }
}

// CREATING INTERFACE ------------------------------------------------
class Atm {
    Scanner sc = new Scanner(System.in);

    double balance = 100;
    int PIN = 1111;

    // GETTERS AND
    // SETTERS------------------------------------------------------------------
    // GETTERS AND
    // SETTERS------------------------------------------------------------------
    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    // ATM
    // OPERATIONS-----------------------------------------------------------------------
    // ATM
    // OPERATIONS-----------------------------------------------------------------------

    void checkBalance() {
        System.out.print("-------------------------------------------------------------\n");

        System.out.println("          Available Balance:-- ₹" + getBalance());

        System.out.print("-------------------------------------------------------------\n");
        menu();
    }

    void depositMoney() {
        System.out.print("-------------------------------------------------------------\n");

        System.out.print("👉Enter The Amount You Want To DEPOSIT:-- ₹");
        double depositAmount = sc.nextInt();

        setBalance(balance + depositAmount);

        System.out
                .println("\n    Amount Deposited Successfully✅✅\n    Updated Balance:-- ₹" + getBalance());

        System.out.print("-------------------------------------------------------------\n");
        menu();
    }

    void withdrawMoney() {
        System.out.print("-------------------------------------------------------------\n");

        System.out.print("👉Enter The Amount You Want To WITHDRAW:-- ₹");
        int withdrawAmount = sc.nextInt();

        if (withdrawAmount < getBalance()) {

            setBalance(balance - withdrawAmount);

            System.out.println("\n    Amount Withdrawl Successfull✅✅\n    Updated Balance:-- ₹" + getBalance());

            System.out.print("-------------------------------------------------------------\n");

        } else {
            // System.out.print("-------------------------------------------------------------\n");

            System.out.println("\n            ❌❌ Insufficient Funds!!");

            System.out.print("-------------------------------------------------------------\n");
        }
        menu();
    }

    // HERE WE ARE CHECKING THE
    // PIN------------------------------------------------------------------------------
    // HERE WE ARE CHECKING THE
    // PIN------------------------------------------------------------------------------

    void checkPin() {
        System.out.println(
                "-------------------------------------------------------------\n-------------------------------------------------------------");

        // FIRST ATTEMPT
        // FIRST ATTEMPT
        System.out.print("👉Enter Your Pin:-- ");
        int pin = sc.nextInt();

        if (pin == PIN) {
            System.out.println();
            menu();
        } else {
            System.out.println("Enter A Valid Pin!!");

            System.out.print("\n👉Enter Your Pin Again:-- ");
            int pin2 = sc.nextInt();

            // 2ND ATTEMPT
            // 2ND ATTEMPT
            if (pin2 == PIN) {
                System.out.println(
                        "-------------------------------------------------------------\n");

                menu();
            } else {
                System.out.println("Enter A Valid Pin!!");

                System.out.print("\n👉Enter Your Pin (Last Attempt):-- ");
                int pin3 = sc.nextInt();

                // 3RD ATTEMPT
                // 3RD ATTEMPT
                if (pin3 == PIN) {
                    System.out.println(
                            "-------------------------------------------------------------\n");

                    menu();
                } else {
                    System.out.println("Your Card Has Been Blocked!!");
                }
            }
        }
    }

    // MENU
    // OPTIONS---------------------------------------------------------------------------------
    // MENU
    // OPTIONS---------------------------------------------------------------------------------

    void menu() {

        System.out.println("1. Deposit Money\n2. Withdraw Money\n3. A/C Balance\n4. Exit");

        System.out.print("-> Choose One Option, Press(1-4):-- ");
        int option = sc.nextInt();

        while (true) {

            // OPTION-1
            // OPTION-1
            if (option == 1) {
                depositMoney();

                // OPTION-2
                // OPTION-2
            } else if (option == 2) {
                withdrawMoney();

                // OPTION-3
                // OPTION-3
            } else if (option == 3) {
                checkBalance();
            } else if (option == 4) {
                System.out.print("-------------------------------------------------------------\n");

                System.out.println("                Exited✅✅");

                System.out.print("-------------------------------------------------------------\n");

                System.exit(0);
            } else {
                System.out.print("-------------------------------------------------------------\n");

                System.out.println("           ❌❌ Choose A Valid Option!!");

                System.out.print("-------------------------------------------------------------\n");
                menu();
            }
        }
    }
}
