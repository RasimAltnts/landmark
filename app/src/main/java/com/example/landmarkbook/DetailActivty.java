package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_activty);

        ImageView imageView = findViewById(R.id.imageView);
        TextView landmarkText=findViewById(R.id.LandmarkText);
        TextView countryText = findViewById(R.id.CountrynameText);

        Intent intent = getIntent();
        String countrynames = intent.getStringExtra("name");
        String landmark = intent.getStringExtra("landmark");

        landmarkText.setText(landmark);
        countryText.setText(countrynames);
        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());

    }
}