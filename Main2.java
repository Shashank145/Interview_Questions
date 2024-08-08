public class Main2 {
    //Replace first and last chars of each word in a String

    public static void main(String[] args) {


        String input = "welcome to india";
        String[] str = input.split(" ");
        String result = "";
        for (String s : str) {
            char first = s.charAt(0);
            String sub = s.substring(1, s.length() - 1);
            char last = s.charAt(s.length() - 1);
            result = result + last + sub + first + " ";
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}
