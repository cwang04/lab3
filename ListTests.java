import static org.junit.Assert.*;
import java.util.ArrayList;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

public class ListTests {
    class CheckLowerCase implements StringChecker{
        public boolean checkString(String s) {
            return s.toLowerCase().compareTo(s) == 0;
        }
    }

    @Test
    public void testFilter() {
        CheckLowerCase clc = new CheckLowerCase();
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> test = new ArrayList<>();
        input.add("a");
        input.add("bc");
        input.add("D");
        test.add("a");
        test.add("bc");
        assertEquals(true, test.equals(ListExamples.filter(input, clc)));
    }

    @Test
    public void testMerge() {
        ArrayList<String> input1 = new ArrayList<>();
        ArrayList<String> input2 = new ArrayList<>();
        input2.add("a");
        input2.add("b");
        ArrayList<String> test = new ArrayList<>();
        test.add("a");
        test.add("b");
        assertEquals(true, test.equals(ListExamples.merge(input1, input2)));
    }
}
