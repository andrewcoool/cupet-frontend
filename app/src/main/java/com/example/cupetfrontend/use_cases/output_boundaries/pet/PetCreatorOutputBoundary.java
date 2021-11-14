package com.example.cupetfrontend.use_cases.output_boundaries.pet;

import com.example.cupetfrontend.use_cases.response_models.pet.PetCreatorFailResponseModel;
import com.example.cupetfrontend.use_cases.response_models.pet.PetCreatorSuccessResponseModel;

/**
 * An interface defining a class responsible for receiving the response of a
 * create pet request.
 */
public interface PetCreatorOutputBoundary {
    /**
     * Method called when a successful response is received.
     * @param response The response data
     */
    void onCreatePetSuccess(PetCreatorSuccessResponseModel response);
    /**
     * Method called when a failed response is received.
     * @param response The response data
     */
    void onCreatePetFailure(PetCreatorFailResponseModel response);
}
