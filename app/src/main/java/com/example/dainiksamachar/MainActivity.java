package com.example.dainiksamachar;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.IDNA;
import android.text.InputType;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnLogin;
    private CheckBox checkBox;
    private Button btnregister;
    private int counter = 5;
    private TextView attempts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = (CheckBox) findViewById(R.id.checkBox);
        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnregister = (Button) findViewById(R.id.btn_register1);
        attempts = (TextView) findViewById(R.id.attempts);
        attempts.setText("No. of remaining attempts : 5");

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    // show password
                    etPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    // hide password
                    etPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUsername.getText().toString().equals("prabin")
                        && etPassword.getText().toString().equals("prabin")) {
                    Toast.makeText(getApplicationContext(), "Welcome to Dainik Samachar",
                            Toast.LENGTH_SHORT).show();
                    openNewActivity();

                } else {
                    counter--;


                    attempts.setText("No. of remaining attempts : " + String.valueOf(counter));
                    if (counter == 2) {

                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setIcon(R.drawable.lock);
                        builder.setTitle("Warning!!!");
                        builder.setMessage("you have only 2 attempts left.");
                        builder.setNegativeButton("Continue", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });


                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();

                    }


                    if (counter == 0) {


                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setIcon(R.drawable.lock);
                        builder.setTitle("Warning!!!");
                        builder.setMessage("you have entered incorrect password for 5 times.");
                        attempts.setText("");


                        builder.setNegativeButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });


                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        btnLogin.setEnabled(false);
                    }
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister();

            }
        });


    }


    public void openRegister() {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);


    }

    public void openNewActivity() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}



