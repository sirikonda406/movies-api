package com.mahesh.movies.api.moviesapi.generics;

import java.util.Collections;
import java.util.List;

public class GenericsCollection  {

    public <T> void printList(List<?> list){
        System.out.println(list);
    }
}
