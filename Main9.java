import java.util.Arrays;
import java.util.Collections;

public class Main9 {
    //2nd largest number
    public static void main(String[] args)
    {
        int[] input = {10,40,38,29,58,27,44,58,29,50};
        Integer secondLargest = Arrays.stream(input)
                .mapToObj(x->x)
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println("2nd largest number is: "+secondLargest);
    }
}
