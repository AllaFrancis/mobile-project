package ru.mirea.gavrilovaad.multiactivity;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String text = (String) getIntent().getSerializableExtra("key");
        TextView textView = findViewById(R.id.textView2);
        textView.setText(text);
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "2 onStart()");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "2 onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "2 onPause()");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "2 onStop()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "2 onDestroy()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "2 onRestart()");
    }
}