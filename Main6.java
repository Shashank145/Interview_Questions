import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main6 {

    public static void main(String[] args) {
        List<Integer> range1 = IntStream.range(0, 401).boxed().collect(Collectors.toList());
        List<Integer> range2 = IntStream.range(300, 501).boxed().collect(Collectors.toList());
        System.out.println(range1);
        System.out.println(range2);
        //method-1
        range1.retainAll(range2);
        System.out.println(range1);

        //method-2
        Set<Integer> common = new HashSet<>();
        for (int i = 0; i < range1.size(); i++) {
            for (int j = 0; j < range2.size(); j++) {
                if (Objects.equals(range1.get(i), range2.get(j))) {
                    common.add(range1.get(i));
                }
            }
        }
        System.out.println(common);

    }


}
