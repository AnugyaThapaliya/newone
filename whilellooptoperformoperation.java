import java.util.Scanner;

/**
 * Write a description of class whilellooptoperformoperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whilellooptoperformoperation
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    {
        int choice = 1; // 1 = continue, 0 = stop

        while (choice == 1) {
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;

                default:
                    System.out.println("Invalid operation!");
                    break;
            }

            System.out.println("Do you want to continue? (1 = Yes, 0 = No): ");
            choice = sc.nextInt();
        }

        System.out.println("Program exited.");
        sc.close();
    }
}
}
        
