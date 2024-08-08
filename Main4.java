import java.util.Arrays;

public class Main4 {

    //Program to Check whether two Strings are anagram of each other

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        int l1 = str1.length();
        int l2 = str2.length();

        if (l1 != l2) {
            System.out.println("Strings are not anagram due to length mismatch");
        } else {

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            String sortedStr1 = new String(charArray1);
            String sortedStr2 = new String(charArray2);

            if (sortedStr1.equals(sortedStr2)) {
                System.out.println("Strings are anagram");
            } else {
                System.out.println("Strings are not anagram");
            }

        }

    }
}
