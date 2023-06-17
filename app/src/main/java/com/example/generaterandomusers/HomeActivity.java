package com.example.generaterandomusers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.generaterandomusers.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {
    
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Home");
        handleUserBtn();
        handleRandomUserBtn();
    }

    private void handleUserBtn() {
    }

    private void handleRandomUserBtn() {
        binding.randomUserBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, GeneratorRandomUsersActivity.class);
            startActivity(intent);
        });
    }
}