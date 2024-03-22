package ru.mirea.gavrilovaad.multiactivity;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextText);
        String text = editText.getText().toString();
        intent.putExtra("key", text);

        startActivity(intent);
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "1 onStart()");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "1 onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "1 onPause()");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "1 onStop()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "1 onDestroy()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "1 onRestart()");
    }
}