package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image1,image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image1.setOnClickListener(this::onClick);
        image2.setOnClickListener(this::onClick);
    }
    private void onClick(View view){
        if(view.getId()==R.id.image2) {
            image1.setVisibility(View.VISIBLE);
            image2.setVisibility(View.GONE);

        }
        else{
            image2.setVisibility(View.VISIBLE);
            image1.setVisibility(View.GONE);

        }

    }
}
