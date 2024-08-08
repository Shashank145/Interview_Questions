import java.util.Arrays;

public class Main5 {

    //Bubble sort : Time Complexity: Worst Case O(n^2), Average Case O(n^2), Best Case O(n)

    public static void main(String[] args) {
        int[] data = {6, 5, 8, 1, 2};
        sortedData(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sortedData(int[] data) {

        for (int i = 0; i < data.length - 1; i++) { //N-1 pass
            boolean isSwap = false;
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }

    }


}
