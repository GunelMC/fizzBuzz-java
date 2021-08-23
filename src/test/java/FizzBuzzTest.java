import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testGenerateListsNumbersUpToOne() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(1);
        assertEquals("1", result);
    }

    @Test
    void testGenerateListsNumbersUpToThree() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(3);
        assertEquals("1, 2, Fizz", result);
    }

    @Test
    void testGenerateListsNumbersUpToFive() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(5);
        assertEquals("1, 2, Fizz, 4, Buzz", result);
    }
}