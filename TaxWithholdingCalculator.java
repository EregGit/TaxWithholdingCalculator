import java.util.Scanner;

/**
 * TaxWithholdingCalculator computes weekly payroll withholdings
 * based on gross income and federal tax brackets.
 *
 * @author Student
 */
public class TaxWithholdingCalculator {

    public static void main(String[] args) {

        // Variable declarations
        double grossIncome;
        double federalTax = 0.0;
        double socialSecurity;
        double medicare;
        double totalWithholding;
        double netPay;

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt for gross weekly income
        System.out.print("Enter gross weekly income: $");
        grossIncome = input.nextDouble();

        // Validate input is non-negative
        if (grossIncome < 0) {
            System.out.println("Invalid income. Income must be zero or greater.");
            input.close();
            return;
        }

        // Determine federal tax using compound relational operators
        if (grossIncome >= 0 && grossIncome <= 267) {
            federalTax = grossIncome * 0.10;
        } else if (grossIncome >= 268 && grossIncome <= 1293) {
            federalTax = grossIncome * 0.12;
        } else if (grossIncome >= 1294 && grossIncome <= 2491) {
            federalTax = grossIncome * 0.22;
        } else if (grossIncome >= 2492 && grossIncome <= 3832) {
            federalTax = grossIncome * 0.24;
        } else if (grossIncome >= 3833 && grossIncome <= 8321) {
            federalTax = grossIncome * 0.32;
        } else if (grossIncome >= 8322 && grossIncome <= 11602) {
            federalTax = grossIncome * 0.35;
        } else if (grossIncome >= 11603) {
            federalTax = grossIncome * 0.37;
        }

        // Calculate Social Security and Medicare
        socialSecurity = grossIncome * 0.062;
        medicare = grossIncome * 0.0145;

        // Calculate total withholding and net pay
        totalWithholding = federalTax + socialSecurity + medicare;
        netPay = grossIncome - totalWithholding;

        // Display payroll summary
        System.out.println("--- Payroll Summary ---");
        System.out.printf("Gross Income:      $%.2f%n", grossIncome);
        System.out.printf("Federal Tax:       $%.2f%n", federalTax);
        System.out.printf("Social Security:   $%.2f%n", socialSecurity);
        System.out.printf("Medicare:          $%.2f%n", medicare);
        System.out.printf("Total Withholding: $%.2f%n", totalWithholding);
        System.out.printf("Net Pay:           $%.2f%n", netPay);

        // Close the Scanner
        input.close();
    }
}
