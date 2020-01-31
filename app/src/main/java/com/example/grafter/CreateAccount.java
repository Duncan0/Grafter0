package com.example.grafter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CreateAccount extends AppCompatActivity {

    // acc button -> new account

    // address - ask after sign up?
    // payment info - req after sign up

    private EditText Email;
    private EditText FirstName;
    private EditText LastName;
    private EditText Phone;
    private EditText Password;

    private Spinner AccountType;

    private Button SignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        // Declare all UI elements
        Email = findViewById(R.id.newEmailAddress);
        FirstName = findViewById(R.id.newFirstName);
        LastName = findViewById(R.id.newLastName);
        Phone = findViewById(R.id.newPhoneNumber);
        Password = findViewById(R.id.newPassword);
        AccountType = findViewById(R.id.accountTypeSpinner);
        SignUp = findViewById((R.id.createButton));

        //todo add create account

    }
}
