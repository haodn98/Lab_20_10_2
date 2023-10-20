import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double num1 = sc.nextDouble();
//        System.out.println("enter operation * or / or + or -");
//        String operator = sc.nextLine();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        System.out.println("Multiply " + (num1 * num2));
        System.out.println("Sum " + (num1 + num2));
        System.out.println("Difference " +  (num1 - num2));
        if (num2 == 0) {
            System.out.println("Cannot divide by 0");
        }
        else {
            System.out.printf("Division %.2f ", (num1 / num2));
        }
//        switch (operator) {
//            case "*" -> {
//                System.out.println(num1 * num2);
//                return;
//            }
//
//            case "/" -> {
//                System.out.println(num1 / num2);
//                return;
//            }
//
//            case "-" -> {
//                System.out.println(num1 - num2);
//                return;
//            }
//            case "+" -> {
//                System.out.println(num1 + num2);
//                return;
//            }
//            default -> {
//                System.out.println("wrong operator");
//                return;
//            }
        }


    }
