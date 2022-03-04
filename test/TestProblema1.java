import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {

    @Test
    static void testProblema1() {
        Problema1 problema1 = new Problema1();

        int max = problema1.getMax();
        int min = problema1.getMin();

        String expected = "12Fizz34Buzz5Fizz678Fizz9Buzz1011Fizz121314FizzFizzBuzz1617Fizz1819Buzz20";

        String actual = problema1.problema1(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
