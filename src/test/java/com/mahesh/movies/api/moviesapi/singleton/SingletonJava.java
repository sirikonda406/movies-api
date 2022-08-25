package com.mahesh.movies.api.moviesapi.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonJava implements Cloneable, Serializable {

    private static SingletonJava singletonJava;

    private SingletonJava() throws IllegalAccessException {

        if (singletonJava != null) throw new IllegalAccessException("Instance cannot be created");

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("New SingletonJava can't be created");
    }

    Object readResolve() throws ObjectStreamException {
        return singletonJava;
    }

    public static SingletonJava getInstance() throws IllegalAccessException {
        return (singletonJava == null) ? singletonJava = new SingletonJava() : singletonJava;
    }
}
