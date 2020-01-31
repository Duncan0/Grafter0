package com.example.grafter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccount extends AppCompatActivity {

    // acc button -> new account

    // NO usernames
    // email address
    // firstname
    // lastname
    // phone number
    // password

    // account type

    // address - ask after sign up?
    // payment info - req after sign up

    private EditText Name;
    private EditText Password;
    private EditText FirstName;
    private EditText LastName;
    private EditText Email;
    private EditText Phone;

    private Button Create;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Name = findViewById(R.id.textUsername);
        Password = findViewById(R.id.textPassword);
        Create = findViewById((R.id.createButton));

    }
}
