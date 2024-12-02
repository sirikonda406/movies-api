package com.mahesh.movies.api.moviesapi.puzzle;

public class ReverseString {

    public static void main(String[] args) {
        String str = "mahesh";
        char[] charArray = str.toCharArray();
        char[] reverseCharArray = new char[charArray.length];
        int j = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseCharArray[j] = charArray[i];
            j++;
        }
        //  System.out.println(reverseCharArray);

        String reverseStr = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println(reverseStr);
    }
}
