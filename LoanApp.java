/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loan;
import java.util.Scanner;
/**
 *
 * @author Huawei
 */
public class LoanApp {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char again;

        do {
            System.out.println("Loan Interest Calculator");

            System.out.print("Enter loan amount: ");
            double principal = input.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double rate = input.nextDouble() / 100;

            System.out.print("Enter loan term (years): ");
            int years = input.nextInt();

            Loan loan = new Loan(principal, rate, years);

            System.out.println("\nChoose Interest Type:");
            System.out.println("1. Simple Interest");
            System.out.println("2. Compound Interest");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                double interest = loan.calculateSimpleInterest();
                System.out.printf("\nSimple Interest: %.2f%n", interest);
            } else if (choice == 2) {
                double interest = loan.calculateCompoundInterest();
                System.out.printf("\nCompound Interest: %.2f%n", interest);

                double[] balances = loan.getYearlyBalances();
                System.out.println("\nYearly Balances:");
                for (int i = 0; i < balances.length; i++) {
                    System.out.printf("Year %d: %.2f%n", i + 1, balances[i]);
                }
            } else {
                System.out.println("\nInvalid choice.");
            }

            System.out.print("\nDo you want to calculate another loan? (y/n): ");
            again = input.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        input.close();
        System.out.println("\nProgram terminated.");
    }
}

