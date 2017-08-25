package com.bean.java.food_store;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {
    EditText name, surname, username, email, password, cPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        //Collecting data from UI
        name = (EditText) findViewById(R.id.txtName);
        surname = (EditText) findViewById(R.id.txtSurname);
        username = (EditText) findViewById(R.id.txtUsername);
        email = (EditText) findViewById(R.id.txtEmail);
        password = (EditText) findViewById(R.id.txtPassword);
        cPassword = (EditText) findViewById(R.id.txtCpassword);
    }

}
