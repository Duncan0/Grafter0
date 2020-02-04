package com.example.grafter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FreelancerHomeFragment extends AppCompatActivity {

    // login -> home, messages, new service, notifications, account

    // home if(acctype == customer) {load explore page}
    // home if ' == freelancer {load summary page}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_freelancer_home);
    }
}
