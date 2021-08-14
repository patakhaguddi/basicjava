package SwitchCase;
import java.util.Scanner;
public class ATM_Booth {
    public static void main(String args[] ){
        double balance=2500;
        int withdraw, deposit;
        int PIN= 2234;
        int pin;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Check balance ");
            System.out.println("Choose 2 for Withdraw Money");
            System.out.println("Choose # for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n =s.nextInt();

            switch(n)
            {
                case 1:
                    System.out.print("Enter PIN to check balance");
                    pin=s.nextInt();
                    for (int i =0; i<3;i++) {
                        if (pin != PIN) {
                            System.out.println("You have entered wrong PIN.");
                            System.out.println("Please enter correct pin");
                            pin = s.nextInt();
                        } else {
                            System.out.println("Your balance is:" + balance);
                        }
                        System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                    }

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    if (deposit%500==0) {
                        {
                            System.out.println("Balance is not divisible by 500. Please try with another amount.");
                            deposit = s.nextInt();
                        }
                    }

                case 3:
                    System.out.println("Withdraw amount");
                    withdraw = s.nextInt();
                    if (withdraw<balance) {
                        System.out.println("Not enough balance. Please input valid amount");
                        withdraw = s.nextInt();
                    }



                        }
                }

            }
        }
