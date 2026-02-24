
    import java.util.Scanner;
    public class Level2p1 {


    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Input: Asking for two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        
        // Arithmetic Operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        // Output the results in the specified format
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        
        input.close();
    }
}
