package com.aayush.hp.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Demo extends AppCompatActivity {

    public void login(View view){
        EditText UsernameEdit= (EditText)findViewById(R.id.UsernameEdit);
        EditText PasswordEdit= (EditText)findViewById(R.id.PasswordEdit);

        Log.i("Username",UsernameEdit.getText().toString());
        Log.i("Password",PasswordEdit.getText().toString());
        Toast.makeText(this, "Hello " + UsernameEdit.getText().toString(), Toast.LENGTH_LONG).show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__demo);
    }
}
