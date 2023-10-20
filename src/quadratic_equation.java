import java.util.Scanner;

public class quadratic_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        switch ((int) a) {
            case 0 -> System.out.println("a cannot be 0 ");
            default -> {
                double delta = Math.pow(b, 2) - (4 * a * c);

                if (delta > 0) {
                    System.out.println("x1 equal " + ((-b + Math.pow(delta,0.5))  / (2 * a)));
                    System.out.println("x2 equal " + ((-b - Math.pow(delta,0.5))  / (2 * a)));
                } else if (delta<0) {
                    System.out.println("No solutions Delta < 0");
                } else {
                    System.out.println("x equal " + (-b / (2 * a)));
                }
                }
            }
        }

    }

