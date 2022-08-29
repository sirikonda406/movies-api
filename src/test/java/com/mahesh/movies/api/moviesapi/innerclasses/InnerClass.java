package com.mahesh.movies.api.moviesapi.innerclasses;

public class InnerClass {

    public static void main(String[] args) {

        Greetings greetings = new Greetings("Hello Mahesh!!!!") {

            private String str = "best efforts";

            @Override
            public String getGreetingMessage() {
                return "Hello from inner class method!!!" + str;
            }

        };
        System.out.println(greetings.getGreetingMessage());


        IGreetings iGreetings = new IGreetings() {
            @Override
            public String sayHello(String message) {
                return "Hello from inner implements interface !!!"+message;
            }
        };
        System.out.println(iGreetings.sayHello("mahesh"));
    }
}
