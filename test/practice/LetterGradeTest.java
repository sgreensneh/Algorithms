package practice;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {
    @Test
    public  void determineLetterGradeTest(){
        var grade = new LetterGrade();
       assertEquals('B', grade.determineLetterGrade(80));
    }

    @Test
    public void negativeNumberShouldReturnIllegalArgumentException(){
        var grade = new LetterGrade();
        assertThrows(IllegalArgumentException.class, ()-> grade.determineLetterGrade(-1));

    }


}