package disc03;
import java.util.Arrays;

public class Array {
    public static int[] insert(int[] arr, int item, int position) {
        int[] resizedArr = new int[arr.length + 1];
        int insertPosition = Math.min(position, arr.length);
        System.arraycopy(arr, 0, resizedArr, 0, insertPosition);
        resizedArr[insertPosition] = item;
        System.arraycopy(arr, insertPosition, resizedArr, insertPosition + 1, arr.length - insertPosition);
        return resizedArr;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static int[] replicate(int[] arr) {
        int[] result = new int[Arrays.stream(arr).sum()];
        int index = 0;
        for (int k : arr) {
            for (int j = 0; j < k; j++) {
                result[index] = k;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(insert(a, 10, 0)));
//        System.out.println(Arrays.toString(insert(a, 20, 100)));
//        System.out.println(Arrays.toString(insert(a, 30, 4)));

//        reverse(a);
//        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(replicate(a)));

    }

}
