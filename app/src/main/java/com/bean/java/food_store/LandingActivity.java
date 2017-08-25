package com.bean.java.food_store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LandingActivity extends AppCompatActivity {

    Button btn;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        //Getting image view that contains gif
        imageView = (ImageView) findViewById(R.id.imgView);

        //Calling activity that will handle registration
        btn = (Button)findViewById(R.id.Register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LandingActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

        //Glide method
        //Glide.with(this)
               // .load("drawable/logo.gif")
                //.into(imageView);

        //Calling activity that will handle the sign in
        btn = (Button)findViewById(R.id.Signin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LandingActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}
