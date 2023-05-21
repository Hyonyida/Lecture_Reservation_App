package com.example.libraryreservationapp;

import com.example.libraryreservationapp.MyResponse;
import com.example.libraryreservationapp.NotificationSender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type: application/json",
            "Authorization:key = AAAA7_BARQY:APA91bFbThxCJGm7mr54M-eDW5qpdiDbcqBKDDG4si9XhgHptIfXanI92RTj3oghd_UWJsoIJGKoJtRQeS2JJFjEXUvxJyYC0gqcDxgVJzIptnBIjQEHz_fEjq5Z_iE5Dyp4-dHk09vO"

    }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
