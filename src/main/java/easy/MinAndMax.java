package com.arrays.easy;

import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        int[] arr={3,21,4,13,5,9,212,-9};
        int []result=resultMinMax(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] resultMinMax(int arr[])
    {
        if(arr.length==0)
        {
            return null;
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        int ans[]={min,max};
        return ans;
    }

}
/**
 * Time Complexity o(n)
 */
