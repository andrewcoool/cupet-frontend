package com.example.cupetfrontend.presenters.pet;

import com.example.cupetfrontend.presenters.abstracts.IFetchPetProfilePresenter;
import com.example.cupetfrontend.presenters.view_model_abstracts.IPetProfileViewModel;
import com.example.cupetfrontend.use_cases.response_models.pet.DefaultFailureResponseModel;
import com.example.cupetfrontend.use_cases.response_models.pet.FetchPetProfileSuccessResponseModel;

public class FetchPetProfilePresenter implements IFetchPetProfilePresenter {
    IPetProfileViewModel petProfileViewModel;

    @Override
    public void setPetProfileViewModel(IPetProfileViewModel petProfileViewModel) {
        this.petProfileViewModel = petProfileViewModel;
    }

    @Override
    public void onFetchPetProfileSuccess(FetchPetProfileSuccessResponseModel response) {
        petProfileViewModel.onPetProfileSuccess(
                // TODO: uncomment the following line once fetch petImage is combined into fetch pet profile
                // response.getImage(),
                "https://i.insider.com/5484d9d1eab8ea3017b17e29?width=600&format=jpeg&auto=webp",
                response.getName(),
                response.getAge(),
                response.getBreed(),
                response.getBiography()
        );
    }

    @Override

    public void onFetchPetProfileFailure(DefaultFailureResponseModel response) {
        petProfileViewModel.onPetProfileFailure(response.getErrorMessage());
    }

}
