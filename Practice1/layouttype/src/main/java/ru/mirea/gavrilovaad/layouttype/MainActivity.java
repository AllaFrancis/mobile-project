package ru.mirea.gavrilovaad.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView1);
        tv.setText("Привет всем!");
        Button button = findViewById(R.id.button25);
        button.setText("Это кнопка 2..");

    }
}