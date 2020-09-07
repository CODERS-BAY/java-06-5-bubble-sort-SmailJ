package com.codersbay;

public class Main {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int numbers[] ={15,6,4,3,90};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        bubbleSort(numbers);

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

    }
}
