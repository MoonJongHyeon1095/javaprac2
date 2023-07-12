package chapter_21;

import java.util.Arrays;

public class ArrayCopyTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[arr.length];

        //복사방법1
        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[i];
        }

        //복사방법2
        int[] arr2 = Arrays.copyOf(arr, arr.length);

        //복사방법3
        int[] arr3 = arr.clone();

        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr2);
        System.out.println(arr3);

    }
}
