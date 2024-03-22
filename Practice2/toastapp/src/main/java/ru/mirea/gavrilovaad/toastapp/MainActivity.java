package ru.mirea.gavrilovaad.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        EditText editText = findViewById(R.id.edit1);
        String count = String.valueOf(editText.length());
        Toast toast = Toast.makeText(getApplicationContext(),
                "«СТУДЕНТ № 7 ГРУППА БСБО-04-22 Количество символов " + count,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}