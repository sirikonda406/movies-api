package com.mahesh.movies.api.moviesapi.generics;

public class Sound <T extends Animal>{

    String animalSound;

    public Sound(String animalSound) {
        this.animalSound = animalSound;
    }

    public String getAnimalSound() {
        return animalSound;
    }
}
