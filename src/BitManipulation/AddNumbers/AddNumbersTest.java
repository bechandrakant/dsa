package BitManipulation.AddNumbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddNumbersTest {

    @Test
    void addNumsSameSize() {
        AddNumbers addNumbers = new AddNumbers();
        String num1 = "101";
        String num2 = "010";
        String expected = "111";
        String actual = addNumbers.addNums(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void addNumsDifferentSize() {
        AddNumbers addNumbers = new AddNumbers();
        String num1 = "1011";
        String num2 = "010";
        String expected = "1101";
        String actual = addNumbers.addNums(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    void addEmptyNums() {
        AddNumbers addNumbers = new AddNumbers();
        String num1 = "";
        String num2 = "";
        String expected = "0";
        String actual = addNumbers.addNums(num1, num2);
        assertEquals(expected, actual);
    }
}