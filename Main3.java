import java.util.HashSet;
import java.util.Set;

public class Main3 {
    //Remove Duplicate/Repeated words from String

    public static void main(String[] args)
    {
        String str = "Geeks for Geeks A Computer";
        String[] strArr = str.split(" ");
        StringBuilder result = new StringBuilder();
        Set<String> set = new HashSet<>();
        for(String s : strArr)
        {
            if(!set.contains(s))
            {
                result.append(s).append(" ");
                set.add(s);
            }
        }
        System.out.println(result.toString().trim());
        System.out.println(result.substring(0, result.length()-1));
    }
}
