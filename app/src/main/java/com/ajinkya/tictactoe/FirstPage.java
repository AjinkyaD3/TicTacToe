package com.ajinkya.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstPage extends AppCompatActivity {
    public static String player1="";
    public static String player2="";
    EditText p1 ;
    EditText p2 ;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        p1=findViewById(R.id.editTextText1);
        p2=findViewById(R.id.editTextText2);
        b=findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(p1.getText().toString().equals("")||p2.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Please Enter Your Name ",Toast.LENGTH_LONG).show();
                    return;
                }else {
                    player1=p1.getText().toString();
                    player2=p2.getText().toString();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                }
            }
        });


    }
}