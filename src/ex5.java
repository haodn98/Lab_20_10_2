import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        int max = 1;
        int min = 101;
        int flag = 0;
        Random r = new Random();
        while (flag != 10) {
            int number = r.nextInt(1, 100);
            System.out.print(number + " ");
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            flag++;
        }
        System.out.println(" maximum = " + max + ", minimum " + min);
    }
}

