import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main7 {

    //ScoreBoard

    public static void main(String[] args) {
        Integer[] input = {10,40,38,29,58,27,44,58,29,50};

        System.out.println(Arrays.toString(input));
        Integer[] output = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int index = 0;
        for (int score : input) {
            output[index] = score;
            Arrays.sort(output, Collections.reverseOrder());
            index += 1;
            System.out.println(Arrays.toString(output));
        }

    }
}
