package com.example.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ToSumProblem {

    public static void main(String[] args) {
        int target=9;
        //Scanner scan = new Scanner(System.in);
        //target = scan.nextInt();
        int[] arr = {2, 5, 7, 3};
        System.out.print("###### First Approach ######" + "\n");
        findIndexFirstApproach(arr, target);
        System.out.print("###### Second Approach ######" + "\n");
        findIndexSecondApproach(arr, target);
        System.out.print("###### Third Approach ######" + "\n");
        findIndexThirdApproach(arr, target);

    }

    private static void findIndexFirstApproach(int[] arr, int target) {
        int[] resultIndex = new int[2];
        int[] resultValue = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for ( int i = 0 ; i < arr.length ; i++ ) {
            if (map.containsKey(target - arr[i])) {
                resultIndex[0] = map.get(target - arr[i]);
                resultIndex[1] = i;
                resultValue[0] = arr[resultIndex[0]];
                resultValue[1] = arr[resultIndex[1]];
            }
            map.put(arr[i], i);
        }
        System.out.print("Original Array : " + Arrays.toString(arr) + "\n");
        if (resultValue[0] + resultValue[1] == target) {
            System.out.print("Result index : " + Arrays.toString(resultIndex) + "\n");
            System.out.print("Result value : " + Arrays.toString(resultValue) + "\n");
            System.out.print("Result operation : " + resultValue[0] + "+" + resultValue[1] + " = " + target + "\n");
        }else{
            System.out.print("No Result found"+"\n");
        }

    }

    private static void findIndexSecondApproach(int[] arr, int target) {
        Arrays.sort(arr);


    }

    private static void findIndexThirdApproach(int[] arr, int target) {
    }

}
