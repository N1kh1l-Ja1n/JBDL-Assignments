import java.util.Random;

public class Random_Numbers {
    public static void main(String[] args) {
        randNum(5);

    }

    //program to print 5 Random numbers in java stream

    public static void randNum(int num){

        Random random = new Random();

        random.ints(num).forEach( y-> System.out.println(y));
    }
}
