//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = "shashank";
        System.out.println(reverseName(name));

        String msg = "The watch was imported from China";
        System.out.println(reverseWord(msg));

        int number = 987654;
        System.out.println(reverseNumber(number));

        String str = "abc de";
        System.out.println(reversePreservingSpacePositions(str));

        String a1 = "RACEcar";
        System.out.println(isPalindrome(a1));

        String input = "too hot to hoot";
        System.out.println(isSentencePalindrome(input));
        System.out.println("==================================================================================================");

        String a2 = "MALAYALAM";
        System.out.println("No.of palindromic substrings in the given string are "+checkAllPelindromicSubstrings(a2));
    }

    private static int checkAllPelindromicSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String subString = str.substring(i, j + 1);
                if (isPalindrome(subString)) {
                    System.out.println(subString);
                    count++;
                }

            }
        }
        return count;
    }

    private static boolean isSentencePalindrome(String input) {

        String reversePreservingSpacePositions = reversePreservingSpacePositions(input);
        if (reversePreservingSpacePositions.equalsIgnoreCase(input))
            return true;
        else
            return false;
    }

    private static boolean isPalindrome(String a1) {
        String reverse = reverseName(a1);
        if (a1.equalsIgnoreCase(reverse))
            return true;
        else
            return false;
    }

    private static String reversePreservingSpacePositions(String str) {

        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Traverse input string from beginning
        // and put characters in result from end
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {

            // Ignore spaces in input string
            if (inputArray[i] != ' ') {

                // ignore spaces in result.
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        return String.valueOf(result);
    }

    private static int reverseNumber(int number) {

        int reverse = 0;
        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }

        return reverse;

    }

    private static String reverseWord(String msg) {
        String[] arr = msg.split(" ");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i] + " ";
        }
        return new String(result.substring(0, result.length() - 1));
    }

    private static String reverseName(String name) {

        char[] chars = name.toCharArray();
        char[] result = new char[chars.length];
        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            result[j] = chars[i];
            j++;
        }
        return new String(result);
    }
}