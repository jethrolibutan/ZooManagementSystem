package com.example.zoomanagementsystem;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.zoomanagementsystem.R;

public class MainActivity extends AppCompatActivity {

    private TextView textViewAnimalName;
    private TextView textViewAnimalDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewAnimalName = findViewById(R.id.textViewAnimalName);
        textViewAnimalDetails = findViewById(R.id.textViewAnimalDetails);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onAnimalButtonClick(View view) {
        Animal animal;
        switch (view.getId()) {
            case R.id.buttonLion:
                animal = new Lion("Simba", "Carnivore");
                break;
            case R.id.buttonElephant:
                animal = new Elephant("Dumbo", "Herbivore");
                break;
            default:
                return;
        }
        displayAnimalDetails(animal);
    }

    public void displayAnimalDetails(Animal animal) {
        textViewAnimalName.setText(animal.name);
        textViewAnimalDetails.setText(animal.displayDetails());
    }
}
