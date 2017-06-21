package com.example.hhhhh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public static  String TAG = "DisplayMessageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dipslay_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView)findViewById(R.id.textView);
        //TextView textView = new TextView(this);
        Log.d(TAG, "1111111111111111");
        textView.setText(message);
    }

    @Override
    public void onBackPressed() {
        Log.d(TAG, "onBackPresed !!!!");
        finish();
    }

    protected void sendMessage(View view) {
        finish();
    }
}
