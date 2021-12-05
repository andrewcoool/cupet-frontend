package com.example.cupetfrontend.presenters.view_model_abstracts;

public interface IPetProfileViewModel {
    /**
     * This method is called when the fetch pet profile request was successful.
     */
    void onPetProfileSuccess();

    /**
     * This method is called when the fetch pet profile request failed.
     *
     * @param message The error message from the response
     */
    void onPetProfileFailure(String message);
}
