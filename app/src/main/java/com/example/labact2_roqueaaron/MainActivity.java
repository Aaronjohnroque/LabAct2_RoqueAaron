package com.example.labact2_roqueaaron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText etcourse1, etcourse2, etcourse3, etcourse4, etcourse5, etcourse6, etcourse7, etcourse8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etcourse1 = findViewById(R.id.editText);
        etcourse2 = findViewById(R.id.editText2);
        etcourse3 = findViewById(R.id.editText3);
        etcourse4 = findViewById(R.id.editText4);
        etcourse5 = findViewById(R.id.editText5);
        etcourse6 = findViewById(R.id.editText6);
        etcourse7 = findViewById(R.id.editText7);
        etcourse8 = findViewById(R.id.editText8);
    }

    public void saveData(View v) {
        SharedPreferences sp = getSharedPreferences("mydata", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        String c1 = etcourse1.getText().toString();
        String c2 = etcourse2.getText().toString();
        String c3 = etcourse3.getText().toString();
        String c4 = etcourse4.getText().toString();
        String c5 = etcourse5.getText().toString();
        String c6 = etcourse6.getText().toString();
        String c7 = etcourse7.getText().toString();
        String c8 = etcourse8.getText().toString();

        editor.putString("c1_key", c1);
        editor.putString("c2_key", c2);
        editor.putString("c3_key", c3);
        editor.putString("c4_key", c4);
        editor.putString("c5_key", c5);
        editor.putString("c6_key", c6);
        editor.putString("c7_key", c7);
        editor.putString("c8_key", c8);

        editor.commit();
        Toast.makeText(this, "Course Saved...", Toast.LENGTH_LONG).show();

    }

    public void goNext(View v) {
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(i);
    }
}
