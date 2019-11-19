package homework;

import java.util.Arrays;

public class TestDemo3 {

    public static int find(int[] arr, int zhongweishu) {

        int smell = 0;
        int big = arr.length - 1;
        int mid = 0;

        if (zhongweishu < arr[smell] || zhongweishu > arr[big] || smell > big) {
            return -1;
        }
        while (smell <= big) {
            mid = (smell + big) / 2;
            if (arr[mid] > zhongweishu) {
                big = mid - 1;
            } else if (arr[mid] < zhongweishu) {
                smell = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,7};
         int i = find(arr,6);

        if (i < 0){
            System.out.println("否");
        }
        else{
        System.out.println("是");
         }
      }
    }