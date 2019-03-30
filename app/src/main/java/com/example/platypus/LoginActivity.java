package com.example.platypus;


import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.username);
        etPassword = (EditText) findViewById(R.id.password);

        final  Button loginBtn = (Button) findViewById(R.id.login);

        final TextView RegisterLink = (TextView) findViewById(R.id.create);

        loginBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Log.d(String.valueOf(this.getClass()),"//////////////////////////////////////");
                Log.d(String.valueOf(this.getClass()),"//////////////////////////////////////");
                Log.d(String.valueOf(this.getClass()),"//////////////////////////////////////");
                Log.d(String.valueOf(this.getClass()),"//////////////////////////////////////");
                Log.d(String.valueOf(this.getClass()),"//////////////////////////////////////");
                Log.d(String.valueOf(this.getClass()),"//////////////////////////////////////");
                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;
                 Toast.makeText(context, text, duration).show();

            }
        });


        RegisterLink.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

    }


}
