package homework;

import java.util.Arrays;

public class TestDemo2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = new int[arr1.length * 2];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];

        }
        System.out.println(Arrays.toString(arr2));
    }

}