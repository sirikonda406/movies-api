package com.mahesh.movies.api.moviesapi.puzzle;

import java.time.LocalDate;

public class DateReturnsDay {

    public static void main(String[] args) {
        System.out.println(findDay(31, 8, 2019));
    }

    private static String findDay(int i, int i1, int i2) {
        LocalDate localDate = LocalDate.of(i2, i1, i);
        String day = localDate.getDayOfWeek().name().toLowerCase();
        StringBuilder builder=new StringBuilder(day);

        builder.substring(0,1).toUpperCase();
        builder.append(builder.substring(0,1).toUpperCase()).append(day.substring(1,day.length()));
        return builder.toString();
    }
}
