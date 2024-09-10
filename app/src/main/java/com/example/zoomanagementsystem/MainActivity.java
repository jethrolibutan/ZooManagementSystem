package com.example.zoomanagementsystem;


import android.os.Bundle;
import android.view.View;
import com.example.zoomanagementsystem.Lion;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onAnimalButtonClick(View view){
        Lion lion = new Lion("Simba", "Lion");
        displayAnimalDetails(lion);
    }

    public void displayAnimalDetails(Animal animal){
        String details = animal.displayDetails() + "\n Sound: " + animal.makeSound() + "\n\n";
//        animalDetailsTextView.setText(details);
    }
}