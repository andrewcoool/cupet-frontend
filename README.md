# cupet-frontend

## Repository Description

This is the frontend Android portion of the Cupet application.

## App Specification

Cupet is an Android app with two parts: a frontend and a backend. The frontend is where
a user interacts with the app. The backend is responsible for storing, processing, and relaying
data from and to the frontend. Users of the app can register and log in to the app using their
email and password. To register, a user needs to provide details, including their full name, email
address, home address, and city. Each user has their own user profile.

Each user can have multiple pets, which each have their own pet profile. For each of
their pets, the app displays to the user a list of other pets—or, potential matches for that pet.
The potential matches are displayed based on location. Users are able to select which pets they
are interested in matching with from this list.

If two users have selected each other’s pets, they have matched with each other, and
their pets are added to each other’s match list. The two users are then able to view each other’s
contact information on each other’s profiles.

## Developer Notes & Instructions

To be able to interact with the backend API, you must run an instance of the backend on your local machine. 
The Android VM runs on a virtual network. For the Android VM to be able to see the instance of the backend, set `RoutesStore.ROOT_ROUTE` to `http://<your local ip address>:8080`.

All tests are available in the `androidTest/com.example.cupetfrontend/` directory. Please note that our tests rely on you running an instance of the android emulator.
