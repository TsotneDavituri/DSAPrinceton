import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        double i = 1;

        while (!StdIn.isEmpty()) {
            String input = StdIn.readString();

            if (StdRandom.bernoulli(1 / i)) {
                champion = input;
            }
            i++;
        }
        System.out.println(champion);
    }
}

