package com.example.generaterandomusers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GeneratorRandomUsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator_random_users);
        getSupportActionBar().setTitle("Random Users");
    }
}