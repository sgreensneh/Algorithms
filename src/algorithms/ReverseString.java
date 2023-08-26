package algorithms;

public class ReverseString {
    public static void main(String[] args) {
        char[] inputString = {'s', 'g', 'r', 'e', 'e', 'n'};
        reverseString(inputString);
        System.out.println(inputString);

    }
    public static void reverseString(char[] characters){
        int left = 0;
        int right = characters.length - 1;
        while (left < right){
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
    }

}
