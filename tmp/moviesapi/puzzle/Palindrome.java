package com.mahesh.movies.api.moviesapi.puzzle;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        int tempInt=x;
        int reverseInt = 0;
        if(x<=0)return false;
        while (x != 0) {
            reverseInt = reverseInt*10 + x % 10;
            x = x / 10;
        }
        return (tempInt==reverseInt);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
