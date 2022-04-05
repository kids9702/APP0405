package com.example.test;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // Debug Variable ------------------------------------------

    private static final String TAG = "MainActivity";
    private Boolean DEBUG           = true;

    // Member Variable ------------------------------------------

    private EditText edTXT;
    private Button play, say;
    private LinearLayout bg;
    // Override Method ------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        if(DEBUG) Log.i(TAG, "onCreate()");

        // XML 파일에 존재하는 UI 요소 객체에 저장하기 => ID로 UI 요소를 찾아서 설정
        edTXT = (EditText) findViewById(R.id.edTXT);
        play = (Button) findViewById(R.id.play);
        say = (Button) findViewById(R.id.say);
        bg = (LinearLayout) findViewById(R.id.bg);


    }

    @Override
    protected void onStart() {
        super.onStart();
        if(DEBUG) Log.i(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(DEBUG) Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(DEBUG) Log.i(TAG, "onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        if(DEBUG) Log.i(TAG, "onRestart()");
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

    // onClick 속성의 메서드 ------------------------------------------

    public void clickFunc(View view) {
        switch (view.getId())
        {
            case R.id.play:
                if(DEBUG) Log.i(TAG, "놀자");
                edTXT.setText("");
                break;
            case R.id.say:
                if(DEBUG) Log.i(TAG, "어쩔티비");
                Log.i(TAG, edTXT.getText().toString());
                break;
            case R.id.bg:
                if(DEBUG) Log.i(TAG, "바탕");
                edTXT.setText("HI");
                bg.setBackgroundColor(Color.RED);
                break;
        }
    }

}