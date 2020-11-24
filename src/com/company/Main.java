package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {45, 4, 20, 86, 35, 14, 8, 6};
        int length = arr.length;
        int max = arr[0];
        for (int i = 0; i < length; i ++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
