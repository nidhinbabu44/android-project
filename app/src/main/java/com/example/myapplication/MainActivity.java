package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    AppCompatButton b1;
    AppCompatButton b2;
    String getusername,getaddress,getphoneno,getemailid,getuserid,getpassword,getconfirmpassword;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.Name);
        ed2=(EditText) findViewById(R.id.Phoneno);
        ed3=(EditText)findViewById(R.id.address);
        ed4=(EditText) findViewById(R.id.Phoneno);
        ed5=(EditText)findViewById(R.id.Emailid);
        ed6=(EditText) findViewById(R.id.username);
        ed7=(EditText)findViewById(R.id.confirmpassword);


        b1=(AppCompatButton) findViewById(R.id.login);
        b2=(AppCompatButton) findViewById(R.id.gotoregister);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),regesreractivity.class);
                startActivity(i);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getusername=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getusername,Toast.LENGTH_LONG).show();
                getpassword=ed2.getText().toString();
              Toast.makeText(getApplicationContext(),getpassword,Toast.LENGTH_LONG).show();

            }

        });



    }
}