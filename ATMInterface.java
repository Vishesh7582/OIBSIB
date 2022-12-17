package ATM;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) throws ParseException {
        Scanner vj = new Scanner(System.in);
        int balance = 10000;

        NumberFormat.getCurrencyInstance();
        System.out.println("Welcome to Automated Teller Machine! \nKindly Enter your UserId :");
        String Name = vj.nextLine();
        System.out.println("Kindly Enter your 4-digit Pin :");
        int Pin = vj.nextInt();

        while (true) {
            System.out.println("Welcome");
            System.out.println("ATM Menu:");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to know your Transaction History");
            System.out.println("Choose 5 to EXIT");
            System.out.print("Choose the operation you want to perform : ");
            int choice = vj.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter amount to be withdrawn :");
                    int withdrawn = vj.nextInt();
                    if (balance >= withdrawn) {
                        balance -= withdrawn;
                        System.out.println("New balance : " + balance + "\nPlease collect your cash and card !");
                    } else {
                        System.out.println("Insufficient Balance...");
                    }
                }
                case 2 -> {
                    System.out.println("Enter amount to be deposited :");
                    int deposits = vj.nextInt();
                    balance += deposits;
                    System.out.println("New balance : " + balance);
                }
                case 3 -> System.out.println("Current Balance :" + balance);
                case 4 -> {
                    System.out.println("Please enter the Transaction Date \ndd-mm-yyyy");
                    String date = vj.nextLine();
                    Date d = new SimpleDateFormat("dd-MM-yyyy").parse(date);
                    System.out.println(d);
                    System.out.println("Your transaction History in your Savings Account on " + d + " is as follows:");
                    System.out.println("Balance:" + balance);
                }
                case 5 -> System.exit(0);
            }
            System.out.println("Thank You... Have a nice day !");
        }
    }
}