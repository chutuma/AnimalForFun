package com.example.suranits.animalforfun;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String nameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button =(Button)findViewById(R.id.btnStart);
        final EditText editText= (EditText) findViewById(R.id.txtName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.length()==0){//ถ้าอีดิสว่างไม่ต้องกรอกชื่่อ
                    Toast.makeText(getApplicationContext(),"กรุณากรอกชื่อด้วยคะ",Toast.LENGTH_LONG).show();

                }else {
                    nameString = editText.getText().toString().trim();

                    Toast.makeText(getApplication(), "Hello"+nameString, Toast.LENGTH_LONG).show();
                    Intent startIntent = new Intent(MainActivity.this, Game.class);
                    startActivity(startIntent);
                }

            }
        });
    }
}
