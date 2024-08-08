import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main8 {

    //Add 1 in array
    public static void main(String[] args) {

        //check from backward direction of list while 9 do it 0
        //if not getting 9 increase by 1


        List<Integer> numbers = Arrays.asList(9, 9, 9, 9);
        numbers = new ArrayList<>(numbers);

        int index = numbers.size() - 1;


        while (index >= 0 && numbers.get(index) == 9) {
            numbers.set(index, 0);
            index -= 1;

        }

        if (index < 0) {

            numbers.set(0, 1);   // insert an one at the beginning
            numbers.add(numbers.size(), 0); //Add one extra zero at the end of the vector
        } else {
            numbers.set(index, numbers.get(index) + 1); // else increment the value at [index]
        }
        System.out.println(numbers);

    }

}
