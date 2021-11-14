package com.example.cupetfrontend.use_cases.request_models.pet;

/**
 * A class containing the request data for creating a pet.
 */
public class PetCreatorRequestModel {
    private final String token;
    private final String name;
    private final String age;
    private final String breed;
    private final String biography;

    public PetCreatorRequestModel(String token, String name, String age, String breed, String biography) {
        this.token = token;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.biography = biography;
    }

    public String getToken() {
        return token;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getBiography() {
        return biography;
    }
}
