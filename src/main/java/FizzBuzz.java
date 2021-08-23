import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public String generate(Integer upto) {
        List<String> results = IntStream.rangeClosed(1, upto).mapToObj((i) -> i % 15 == 0 ? "FizzBuzz" : (i % 3 == 0) ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i)).collect(Collectors.toList());
        return String.join(", ", results);
    }
}
