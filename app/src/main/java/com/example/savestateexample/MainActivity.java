package com.example.savestateexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textView);
        tv.setText(score+"");
    }

    public void press_action(View view){
        TextView tv = findViewById(R.id.textView);
        score++;
        tv.setText(score+"");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        //key value pair
        savedInstanceState.putInt("SCORE",score);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //restore the variables
        score = savedInstanceState.getInt("SCORE");
        TextView tv = findViewById(R.id.textView);
        tv.setText(score+"");
    }
}
