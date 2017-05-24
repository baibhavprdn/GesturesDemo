package com.example.baibhav.gesturesdemo;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{


    private TextView gesture_tv;
    private GestureDetectorCompat gesturedetectorobject;
    //we defined them outside any class because they are required to be used in multiple classes!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gesture_tv=(TextView) findViewById(R.id.tv_gesture);
        //referencing the textview from the xml to the main

        this.gesturedetectorobject=new GestureDetectorCompat(this,this);
        //Note: object gesturedetectorobject is from the GestureDecectorCompact class which allows us to detect gestures!!

        gesturedetectorobject.setOnDoubleTapListener(this);


    }

    @Override
    public boolean onDown(MotionEvent e) {
        gesture_tv.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        gesture_tv.setText("onShowPress");



    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        gesture_tv.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        gesture_tv.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        gesture_tv.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        gesture_tv.setText("onFling");
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        gesture_tv.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        gesture_tv.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        gesture_tv.setText("onDoubleTapEvent");
        return true;
    }

    //end of gestures

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        this.gesturedetectorobject.onTouchEvent(event);
        //normally the touch on the screen is returned by below code, but we override with the above code to check if it is a gesture mentioned by above overides first!!
        return super.onTouchEvent(event);

    }
}



