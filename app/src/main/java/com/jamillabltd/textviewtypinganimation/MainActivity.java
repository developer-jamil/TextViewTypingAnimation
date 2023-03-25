package com.jamillabltd.textviewtypinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String text_1 = "This is the text to display.";
    private static final int DELAY_MILLIS = 100;

    private Handler mHandler;
    private TextView textView_1;
    private int mIndex = 0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView_1 = findViewById(R.id.textViewId_1);
        mHandler = new Handler();
        Runnable mRunnable = new Runnable() {
            @Override
            public void run() {
                textView_1.setText(text_1.substring(0, mIndex++));
                if (mIndex <= text_1.length()) {
                    mHandler.postDelayed(this, DELAY_MILLIS);
                }
            }
        };
        mHandler.post(mRunnable);



    }

}