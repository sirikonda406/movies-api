package com.mahesh.movies.api.moviesapi.singleton;

public class SingletonTest {
    public static void main(String[] args) throws IllegalAccessException, CloneNotSupportedException {

        SingletonJava singletonJava = SingletonJava.getInstance();
        SingletonJava singletonJavaNewObject = (SingletonJava)singletonJava.clone();
        System.out.println(singletonJava.hashCode());
        System.out.println(singletonJavaNewObject.hashCode());

    }
}
