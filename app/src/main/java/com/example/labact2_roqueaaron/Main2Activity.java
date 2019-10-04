package com.example.labact2_roqueaaron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c = findViewById(R.id.editText9);
        setTitle("Validate");
    }
    public void doCheck(View v) {
        SharedPreferences sp = getSharedPreferences("mydata", MODE_PRIVATE);
        String spc1 = sp.getString("c1_key", null);
        String spc2 = sp.getString("c2_key", null);
        String spc3 = sp.getString("c3_key", null);
        String spc4 = sp.getString("c4_key", null);
        String spc5 = sp.getString("c5_key", null);
        String spc6 = sp.getString("c6_key", null);
        String spc7 = sp.getString("c7_key", null);
        String spc8 = sp.getString("c8_key", null);

        String course = c.getText().toString();

        if (course.equals(spc1) || course.equals(spc2) || course.equals(spc3) || course.equals(spc4) || course.equals(spc5) || course.equals(spc6) || course.equals(spc7) || course.equals(spc8)){
            Toast.makeText(this, "Course is Offered in UST...", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Course is Not Offered in UST...", Toast.LENGTH_LONG).show();
        }
    }



    public void goBack(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
