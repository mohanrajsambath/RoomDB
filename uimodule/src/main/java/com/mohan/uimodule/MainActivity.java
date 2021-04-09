package com.mohan.uimodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  static final String TAG = "MainActivity";
    public Button button_yourmedia,button_allmedia,button_myfav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_yourmedia = findViewById(R.id.button_yourmedia);
        button_allmedia = findViewById(R.id.button_allmedia);
        button_myfav = findViewById(R.id.button_myfav);
        button_yourmedia.setOnClickListener(this);
        button_allmedia.setOnClickListener(this);
        button_myfav.setOnClickListener(this);
        Log.e(TAG,"DEV_URL---=>"+BuildConfig.DEV_URL);
        Log.e(TAG,"RC_URL---=>"+BuildConfig.RC_URL);
        Log.e(TAG,"PROD_URL---=>"+BuildConfig.PROD_URL);
        Log.e(TAG,"BASE_URL---=>"+BuildConfig.APP_URL);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_yourmedia:
                button_allmedia.setVisibility(View.GONE);
                break;
            case R.id.button_allmedia:
                break;
            case R.id.button_myfav:
                button_allmedia.setVisibility(View.VISIBLE);
                break;
        }

    }
}