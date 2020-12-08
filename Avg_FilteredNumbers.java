import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.List;

public class Avg_FilteredNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 11, 22);

        OptionalDouble res = numbers.stream().mapToInt(x -> x * x).filter(x -> x > 100).average();

        System.out.println(res.getAsDouble());

    }

 

}
