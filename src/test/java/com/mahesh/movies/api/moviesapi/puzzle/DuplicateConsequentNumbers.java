package com.mahesh.movies.api.moviesapi.puzzle;

public class DuplicateConsequentNumbers {

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 4, 4, 4, 5};
        printConsecutiveInBrace(arr);
    }

    public static void printConsecutiveInBrace(int arr[]) {
        int printFrom = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                print(arr, printFrom, i);
                printFrom = i + 1;
            }
        }
    }

    public static void print(int arr[], int printFrom, int printTo) {
        if (printFrom < printTo) //Here check: Consecutive Duplicate
            System.out.print("( ");
        for (int i = printFrom; i <= printTo; i++)
            System.out.print(arr[i] + " ");
        if (printFrom < printTo)
            System.out.print(") ");
    }
}

