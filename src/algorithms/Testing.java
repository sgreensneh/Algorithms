package algorithms;

public class Testing {
    public static void main(String[] args) {
        int n = 911;
        System.out.println(reversedNum(n));
    }

    public  static int reversedNum(int n){
        int reverse = 0;
        while (n > 0){
        reverse = reverse * 10 + n % 10;
        n = n /10;
        }
        return reverse;

    }
}
