package com.example.dainiksamachar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class register extends AppCompatActivity {
    private Button button;
private EditText fname, lname, email, number, password, cpassword;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        button = (Button) findViewById(R.id.btn_register2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openHome();
                Toast.makeText(getApplicationContext(), "Sucessfully Logged in.", Toast.LENGTH_LONG).show();
            }
        });


    }







    public void openHome() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);


    }


}
