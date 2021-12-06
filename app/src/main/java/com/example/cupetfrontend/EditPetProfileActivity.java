package com.example.cupetfrontend;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.example.cupetfrontend.controllers.abstracts.IPetController;
import com.example.cupetfrontend.dependency_selector.DependencySelector;
import com.example.cupetfrontend.presenters.abstracts.IEditPetPresenter;

public class EditPetProfileActivity extends AppCompatActivity {
    private String name;
    private int age;
    private String biography;
    private Button submitButton;

    EditText nameInput;
    EditText ageInput;
    EditText biographyInput;

    private void setFieldError(EditText field, Integer errorState){
        if (errorState != null){
            field.setError(getString(errorState));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_pet_profile);

        DependencySelector dependencySelector = ((App) getApplication()).getDependencySelector();
        IPetController petController = dependencySelector.getControllers().getPetController();

        IEditPetPresenter editPetPresenter = dependencySelector.getPetPresenters().getEditPetPresenter();



        nameInput = (EditText) findViewById(R.id.EditProfileName_Input);
        ageInput = (EditText) findViewById(R.id.EditAge_Input);
        biographyInput = (EditText) findViewById(R.id.EditPetBiography_Input);

        submitButton = (Button) findViewById(R.id.EditProfileSubmitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            boolean is_valid = true;
            String error = "The following errors occurred: ";

            public void onClick(View view) {
                name = nameInput.getText().toString();
                age = Integer.parseInt(ageInput.getText().toString());
                biography = biographyInput.getText().toString();

                if (age < 0) {
                    is_valid = false;
                    error += "The age must be greater than 0. ";
                }
                ;

                if (name.length() <= 1) {
                    is_valid = false;
                    error += "The name of the pet must be longer than one character. ";

                }
                ;

                if (!is_valid) {
                    Toast.makeText(getApplicationContext(), error, Toast.LENGTH_LONG).show();
                } else {
                    EditPetProfileData editprofiledata = new EditPetProfileData(name, age, biography);
                    String jsonData = editprofiledata.toJSON();
                    Toast.makeText(getApplicationContext(), jsonData, Toast.LENGTH_LONG).show();

                };

            }

            ;


        });

    }
}