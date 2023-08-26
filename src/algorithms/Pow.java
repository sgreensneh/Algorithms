package algorithms;

public class Pow {
    public static void main(String[] args) {
        double base = 2;
        int exponent = 14;
        System.out.println(pow(base, exponent));
        System.out.println(myPow(base, exponent));

    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }

        return result;
    }


    public static double  myPow(double x, int n) {
        double ans = 1.0;
        long num = n;
        if (n < 0) {
            num = -1 * num;
        }
        while (num > 0) {
            if (num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                ans = ans * x;
                num = num - 1;
            }
        }
        if (n < 0) {
            return (double)(1.0) / (double)(ans);
        }
        return ans;
    }
}
