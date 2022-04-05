package com.example.test;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    // DEBUG 관련 -------------------------------------------------
    private static final String TAG = "TestActivity";
    private static final Boolean DEBUG = true;

    private Button checkBTN;
    private Button secondBTN;
    private LinearLayout bg;
    private View.OnClickListener checkLST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        checkBTN = (Button) findViewById(R.id.checkBTN);
        secondBTN = (Button) findViewById(R.id.secondBTN);
        bg = (LinearLayout) findViewById(R.id.bg);
        checkLST = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.checkBTN:
                        Log.i(TAG, "click");
                        break;

                    case R.id.secondBTN:
                        Log.i(TAG, "second");
                        break;

                    case R.id.bg:
                        Log.i(TAG, "background");
                        break;

                }
            }
        };


        checkBTN.setOnClickListener(checkLST);
        secondBTN.setOnClickListener(checkLST);
        bg.setOnClickListener(checkLST);

        // 버튼에 발생하는 클릭 이벤트를 감지하여서 처리해주는 클릭 이벤트 발생 시 처리해주는 핸들러와 연결 설정
        

        /*
        checkBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "버튼 클릭");
            }
        });
        
        secondBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "세컨드");
            }
        });
        
         */
    }
}