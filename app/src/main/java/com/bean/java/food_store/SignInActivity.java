package com.bean.java.food_store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    Button buttonLogin;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //Collecting data from UI
        email = (EditText) findViewById(R.id.txtEmail);
        password = (EditText) findViewById(R.id.txtPassword);
        buttonLogin = (Button) findViewById(R.id.btnSingin);

        //Button Login
        buttonLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(SignInActivity.this,"Successful",Toast.LENGTH_LONG).show();
                startActivity(new Intent(SignInActivity.this,HomeActivity.class));
            }
        });

    }
}
