package com.example.cupetfrontend.use_cases.response_models.user;

public class FetchUserProfileFailResponseModel {
    private final String errorMessage;

    public FetchUserProfileFailResponseModel(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
