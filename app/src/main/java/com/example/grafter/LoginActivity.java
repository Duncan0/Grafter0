package com.example.grafter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private Button Create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.textUsername);
        Password = (EditText)findViewById(R.id.textPassword);
        Login = (Button)findViewById(R.id.loginButton);
        Create = (Button) findViewById((R.id.createButton));

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (LoginActivity.this, CreateAccount.class);
                startActivity(intent);
            }
        });

    }

    private void validate (String userName, String userPassword){
        // check accounts
        if ((userName.equals("Admin")) && (userPassword.equals("Password"))) {
            Intent intent = new Intent (LoginActivity.this, HomeActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(), "Invalid Username or password", Toast.LENGTH_LONG).show();
        }
    }
}