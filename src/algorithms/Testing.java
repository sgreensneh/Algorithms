package algorithms;

public class Testing {
    public static void main(String[] args) {
        int n = 911;
        double base = 2;
        int exponent = 14;
        System.out.println(reversedNum(n));
        System.out.println(p(base, exponent));
    }

    public  static int reversedNum(int n){
        int reverse = 0;
        while (n > 0){
        reverse = reverse * 10 + n % 10;
        n = n /10;
        }
        return reverse;

    }

    public static double p(double x, int n){
        if(n == 0){
            return 1;
        }

        if (n < 0){
            x = 1/x;
            n = -n;
        }
        double results = 1;
        while (n > 0){
            if(n % 2 == 1){
                results = results * x;
            }
            x = x * x;
            n  /= 2;
        }
        return results;
    }
}
