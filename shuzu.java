package homework;

import java.util.Arrays;

public class shuzu {
    public static void deleteValue(int[]arr,int value) {
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==value){
                for (int j = i+1;j<arr.length;j++){
                    arr[j-1] = arr[j];
                }
            }
        }
    }

    public static void main(String[] args) {
      int []arr ={3,2,2,0};
      deleteValue(arr,2);
      System.out.println(Arrays.toString(arr));
    }

}
