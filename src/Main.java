import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] xArray = {89, 12, 701, -15, 4, 506, 19, -8, 96, 1, -44, 22, 36, 14, 0, 56};
        boolean sorted = false;
        int value;
        System.out.println("Исходный массив: " + Arrays.toString(xArray));
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < xArray.length - 1; i++) {
                if (xArray[i] > xArray[i + 1]) {
                    sorted = false;
                    value = xArray[i];
                    xArray[i] = xArray[i + 1];
                    xArray[i + 1] = value;
                }

            }
        }
        System.out.println("Сортированный массив: " + Arrays.toString(xArray));
    }
}