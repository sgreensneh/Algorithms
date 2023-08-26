package practice;

public class LetterGrade {
    public static void main(String[] args) {

    }

    public char determineLetterGrade(int grade) {
        if(grade < 0) throw  new IllegalArgumentException("Grade cannot be zero");
        if (grade < 60)  return 'F';
        if (grade < 70)    return 'D';
        if (grade < 80)  return 'C';
        if (grade < 90)    return 'B';
        return 'A';

    }
}
