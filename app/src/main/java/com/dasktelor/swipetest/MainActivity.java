package com.dasktelor.swipetest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView directionTextView;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        directionTextView = findViewById(R.id.direction_text);

        directionTextView.setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            void onSwipeRight() {
                directionTextView.setText("Right");
            }

            @Override
            void onSwipeLeft() {
                directionTextView.setText("Left");
            }

            @Override
            void onSwipeTop() {
                directionTextView.setText("Top");
            }

            @Override
            void onSwipeBottom() {
                directionTextView.setText("Bottom");
            }
        });
    }

}