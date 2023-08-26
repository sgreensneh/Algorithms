package chapterEight;

public class HugeInteger {
    int[] digits;

    public HugeInteger(int numbers){
        digits = new int[numbers];
    }


    public  void parse(String number){
        int length = number.length();
        for (int i = 0; i < length ; i++) {
            digits[i] = Character.getNumericValue(number.charAt(length -1 -1));

        }
    }
    public String tOString(){
        return  "";
    }

    public  int add(){
        return 0;
    }


    public  int subtract(){
        return 0;
    }
}
