package com.mahesh.movies.api.moviesapi.designPatterns;

import com.mahesh.movies.api.moviesapi.designPatterns.model.Account;

public class BuilderPattern {

    public static void main(String[] args) {
        Account account = new Account.AccountBuilder("Saving", 123456789l, "Mahesh Sirikonda").build();
        System.out.println();
    }

}
