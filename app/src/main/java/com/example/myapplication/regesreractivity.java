package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class regesreractivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    AppCompatButton b2,b3;
    String Getaddress,getaddress,getphoneno,getemailid,getuserid,getpassword,getconfirmpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regesreractivity);
        ed1=(EditText)findViewById(R.id.Name);
        ed2=(EditText)findViewById(R.id.address);
        ed3=(EditText) findViewById(R.id.Phoneno);
        ed4=(EditText)findViewById(R.id.Emailid);
        ed5=(EditText) findViewById(R.id.username);
        ed6=(EditText)findViewById(R.id.password);
        ed7=(EditText)findViewById(R.id.confirmpassword);
        b3=(AppCompatButton) findViewById(R.id.back);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}