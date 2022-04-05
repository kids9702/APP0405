package com.example.test;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity2 extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener,View.OnKeyListener {
    // DEBUG 관련 -------------------------------------------------
    private static final String TAG = "TestActivity";
    private static final Boolean DEBUG = true;

    private Button checkBTN;
    private Button secondBTN;
    private LinearLayout bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);

        checkBTN = (Button) findViewById(R.id.checkBTN);
        secondBTN = (Button) findViewById(R.id.secondBTN);
        bg = (LinearLayout) findViewById(R.id.bg);


        checkBTN.setOnClickListener(this);
        secondBTN.setOnClickListener(this);
        bg.setOnTouchListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.checkBTN:
                Log.i(TAG, "버튼클릭");
                break;

            case R.id.secondBTN:
                Log.i(TAG, "세컨드");
                Intent go = new Intent(this, MainActivity.class);
                finish(); //현재 Activity 종료
                startActivity(go);
                break;

            case R.id.bg:
                Log.i(TAG, "백그라운드");
                break;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.i(TAG, "Touch : " + view.getId() + "MotionEvent : " + motionEvent.getAction());
        switch (view.getId()){
            case R.id.bg:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    Log.i(TAG, "down");
                    bg.setBackgroundColor(Color.YELLOW);
                }else if(motionEvent.getAction() == MotionEvent.ACTION_UP){
                    Log.i(TAG, "up");
                    bg.setBackgroundColor(Color.BLUE);
                }
        }
        return true;
    }

    @Override
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }
    @Override
    protected void onStop() {
        super.onStop();
        if(DEBUG) Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(DEBUG) Log.i(TAG, "onDestroy()");
    }
}