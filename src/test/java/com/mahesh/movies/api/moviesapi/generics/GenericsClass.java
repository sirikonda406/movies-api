package com.mahesh.movies.api.moviesapi.generics;

public class GenericsClass<T> {

    private T someVarable;

    public GenericsClass(T someVarable) {
        this.someVarable = someVarable;
    }

    public T getSomeVarable() {
        return someVarable;
    }
}
