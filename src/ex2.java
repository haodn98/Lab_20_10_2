import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float userHeight, userWeight;

        System.out.println("Enter your HEIGHT(in sm)");
        userHeight = sc.nextFloat() * (float) Math.pow(10,-2);
        System.out.println("Enter your WEIGHT(in killo)");
        userWeight = sc.nextFloat();

        float BMI = (float) (userWeight/Math.pow(userHeight,2));

        System.out.println(BMI);

        if (BMI <= 16.00){
            System.out.println("Starvation");
        } else if ((16.00 > BMI) && (BMI <= 16.99)) {
            System.out.println("Underweight");
        }
        else if ((17.00 > BMI) && (BMI <= 18.49)) {
            System.out.println("Normal, low range");
        }
        else if ((18.50 > BMI) && (BMI <= 22.99)) {
            System.out.println("Normal, high range");
        }
        else if ((23.00 > BMI) && (BMI <= 24.99)) {
            System.out.println("Overweight, low range");
        }
        else if ((25.00 > BMI) && (BMI <= 27.49)) {
            System.out.println("Overweight, high range");
        }
        else if ((27.50 > BMI) && (BMI <= 29.99)) {
            System.out.println("Normal, high range");
        }
        else if ((30.00 > BMI) && (BMI <= 34.90)) {
            System.out.println("1st degree obesity");
        }
        else if ((35.00 > BMI) && (BMI <= 39.90)) {
            System.out.println("2nd degree obesity");
        }
        else {
            System.out.println("3rd degree obesity");
        }
    }
}
