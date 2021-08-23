import java.util.ArrayList;

public class FizzBuzz {
    public String generate(Integer upto) {
        ArrayList<String> newArray = new ArrayList<>();
        for (int i = 1; i <= upto; i++) {
            if (i % 3 == 0) {
                newArray.add("Fizz");
            } else if (i % 5 == 0) {
                newArray.add("Buzz");
            } else {
                newArray.add(String.valueOf(i));
            }
        }
        return String.join(", ", newArray);
    }
}
