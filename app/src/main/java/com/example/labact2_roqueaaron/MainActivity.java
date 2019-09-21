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
    public void goNext(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
    public void saveData (View v) {
        SharedPreferences sp = getSharedPreferences("my courses", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String course1 = etcourse1.getText().toString();
        String course2 = etcourse2.getText().toString();
        String course3 = etcourse3.getText().toString();
        String course4 = etcourse4.getText().toString();
        String course5 = etcourse5.getText().toString();
        String course6 = etcourse6.getText().toString();
        String course7 = etcourse7.getText().toString();
        String course8 = etcourse8.getText().toString();
        editor.putString("Course", course1);
        editor.putString("Course", course2);
        editor.putString("Course", course3);
        editor.putString("Course", course4);
        editor.putString("Course", course5);
        editor.putString("Course", course6);
        editor.putString("Course", course7);
        editor.putString("Course", course8);
        editor.commit();
        Toast.makeText(this, "courses were saved...", Toast.LENGTH_SHORT).show();
    }
}