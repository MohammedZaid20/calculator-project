package com.example.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edittext1;
    EditText edittext2;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);

        result = findViewById(R.id.TextViewResult);

    }

    public void sum(View view) {

        String text1 = edittext1.getText().toString();
        String text2 = edittext2.getText().toString();

        if (text1.length() == 0 || text2.length() == 0) {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            return;
        }


        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int sum = num1 + num2;

        result.setText("The result is" + " " + sum);
    }

    public void min(View view) {
        String text1 = edittext1.getText().toString();
        String text2 = edittext2.getText().toString();

        if (text1.length() == 0 || text2.length() == 0) {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            return;
        }


        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int sum = num1 - num2;

        result.setText("The result is" + " " + sum);
    }

    public void mult(View view) {

        String text1 = edittext1.getText().toString();
        String text2 = edittext2.getText().toString();

        if (text1.length() == 0 || text2.length() == 0) {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            return;
        }


        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int sum = num1 * num2;

        result.setText("The result is" + " " + sum);

    }

    public void div(View view) {

        String text1 = edittext1.getText().toString();
        String text2 = edittext2.getText().toString();

        if (text1.length() == 0 || text2.length() == 0) {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            return;
        }


        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int sum = num1 / num2;

        result.setText("The result is" + " " + sum);
    }
}
