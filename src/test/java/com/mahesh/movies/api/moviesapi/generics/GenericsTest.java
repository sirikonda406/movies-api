package com.mahesh.movies.api.moviesapi.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
       // genericsClass();
       // genericsMethod();
       // genericsList();
          genericsType();
    }

    private static void genericsType() {
        Sound<Cat> catSound =new Sound<>("meow!!!meow");
        Sound<Dog> dogSound =new Sound<>("Boww!!!Bow");
        System.out.println(catSound.getAnimalSound());
        System.out.println(dogSound.getAnimalSound());
    }

    private static void genericsList() {

        GenericsCollection genericsCollection=new GenericsCollection();
        List<Integer> integerList= Arrays.asList(1,2,3,4,5);
        genericsCollection.printList(integerList);
        List<String> strList= Arrays.asList("a","b","c","d","e");
        genericsCollection.printList(strList);
        List<Cat> catList= Arrays.asList(new Cat("meow!!!"),new Cat("meow!!!meow"));
        genericsCollection.printList(catList);

    }

    private static void genericsMethod() {
        GenericsTypeMethod genericsTypeMethod=new GenericsTypeMethod();
        System.out.println(genericsTypeMethod.getSomeVariable(11));
    }

    private static void genericsClass() {
        GenericsClass<String> genericsClassString =new GenericsClass<>("Hello World!!!");
        System.out.println(genericsClassString.getSomeVarable());

        GenericsClass<Integer> genericsClassInteger =new GenericsClass<>(12);
        System.out.println(genericsClassInteger.getSomeVarable());

        GenericsClass<Long> genericsClassLong =new GenericsClass<>(12L);
        System.out.println(genericsClassLong.getSomeVarable());
    }
}
