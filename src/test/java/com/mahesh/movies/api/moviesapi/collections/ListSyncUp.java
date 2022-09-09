package com.mahesh.movies.api.moviesapi.collections;

import com.mahesh.movies.api.moviesapi.TestData.TestData;

import java.util.List;

public class ListSyncUp {

    public static void main(String[] args) {
        List<Integer> integers1 = TestData.rtrvIntegerList();
        List<Integer> integers2 = TestData.rtrvIntegerList();

        if (!integers1.isEmpty() && !integers2.isEmpty()) {
            if (integers1.size() > integers2.size())
                updateWithZeros(integers1.size(), integers2);
            else if (integers2.size() < integers1.size())
                updateWithZeros(integers2.size(), integers1);
        }
        System.out.println("List1::::"+integers1 + "::::List2::::" + integers2);
    }

    private static void updateWithZeros(int size, List<Integer> integers2) {
        for (int i = (integers2.size() - size); i < integers2.size(); i++) {
            integers2.set(i,0);
        }

    }


}
