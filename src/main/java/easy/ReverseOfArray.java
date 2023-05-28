package com.arrays.easy;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr={3,11,4,5,2,4,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int arr[])
    {
        if(arr.length==0)
            return;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


}
