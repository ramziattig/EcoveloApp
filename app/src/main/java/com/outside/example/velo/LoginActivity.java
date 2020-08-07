package com.outside.example.velo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    Button loginL;
    EditText Loginpass,emaillog;
    TextView Account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginL=findViewById(R.id.loginL);
        Loginpass=findViewById(R.id.Loginpass);
        emaillog=findViewById(R.id.emaillog);
        Account=findViewById(R.id.Account);


        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        loginL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailF = emaillog.getText().toString();
                String passwd = Loginpass.getText().toString();
            }
        });
    }
}