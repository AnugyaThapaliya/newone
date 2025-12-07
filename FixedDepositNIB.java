import java.util.Scanner;
/**
 * To perform fixed deposit calculation
 *
 * Anugya Thapaliya
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("**** Nepal Investment Bank Fixed Deposit Calculator ****");
    // loop control variable
    char choice = 'y';

        while (choice == 'y' || choice == 'Y') {

            System.out.print("Enter principal amount (minimum Rs.1000): ");
            double P = scan.nextDouble();

            System.out.print("Enter annual interest rate (8–12): ");
            double annualRate = scan.nextDouble();

            System.out.print("Enter duration in years (max 5 years): ");
            int years = scan.nextInt();

            // CALCULATIONS
            double monthlyRate = annualRate / 12 / 100; // convert to monthly decimal
            int months = years * 12;                   // total months

            // Calculate (1 + monthlyRate)^months manually using a loop
            double compound = 1;  // start with 1
            for (int i = 1; i <= months; i++) {
                compound= compound * (1 + monthlyRate);
            }

            // Maturity amount before fee
            double A = P * compound;

            // Processing fee = 0.5% of maturity amount
            double feeRate = 0.005;
            double fee = A * feeRate;

            // Final amount customer receives
            double finalAmount = A - fee;

            // OUTPUT SECTION
            System.out.println("\n--- FD Calculation Result ---");
            System.out.println("Principal (P): Rs. " + P);
            System.out.println("Annual Rate: " + annualRate + "%");
            System.out.println("Monthly Rate: " + monthlyRate);
            System.out.println("Duration: " + years + " years (" + months + " months)");
            System.out.println("Maturity Amount before fee (A): Rs. " + A);
            System.out.println("Processing Fee (0.5%): Rs. " + fee);
            System.out.println("Final Amount customer receives: Rs. " + finalAmount);
            System.out.println("-------------------------------\n");

            // ask user to continue
            System.out.print("Do you want to calculate another FD? (y/n): ");
            choice = scan.next().charAt(0);
        }

        System.out.println("Thank you for using NIB FD Calculator!");
        scan.close();
    }
    }
    
