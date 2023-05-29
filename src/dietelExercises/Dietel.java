package dietelExercises;

import java.util.Scanner;

public class Dietel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int num = scanner.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("The sum of the digits is: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


}







