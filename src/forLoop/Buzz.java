package forLoop;

public class Buzz {
    public static void main(String[] args) {

        for (int i = 1; i <=100 ; i++) {
            if (i % 15 == 0){
                System.out.println("FIZZbUZZ");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }

        }
    }
}
