package com.example.puhscks;

import android.util.Log;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class User {

    public static String surname=null;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)

    }

    public User(String surname) {
        this.surname=surname;
        Log.d(TAG,"surname"+surname);
    }


}