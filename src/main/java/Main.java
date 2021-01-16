
public class Main {

    public static int[] cutAfterFour(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                int[] newArray = new int[arr.length - 1 - i];
                int k = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    newArray[k] = arr[j];
                    k++;
                }
                return newArray;
            }
        }
        throw new RuntimeException("4 not found");
    }

    public static boolean oneOrFour(int[] arr) {
        boolean one = false;
        boolean four = false;
        for (int j : arr) {
            if (j == 1) {
                one = true;
            }
            if (j == 4) {
                four = true;
            }
        }
        return one && four;
    }
}
