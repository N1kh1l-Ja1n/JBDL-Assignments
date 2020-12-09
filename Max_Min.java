import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max_Min {

    public static void main(String[] args) {
        lowest();
        highest();
    }

    public static void lowest(){
        List<Integer> numbers = Arrays.asList(4,7,2,9);
        numbers.stream().min(Comparator.comparing(x->x))
                .ifPresent(min-> System.out.println(min));

    }

    public static void highest(){
        List<Integer> numbers1 = Arrays.asList(4,7,2,9);
        numbers1.stream().max(Comparator.comparing(x->x))
                .ifPresent(max-> System.out.println(max));
    }
}
