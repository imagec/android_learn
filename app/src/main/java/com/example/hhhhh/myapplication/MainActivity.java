package com.example.hhhhh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//import static com.example.hhhhh.myapplication.R.id.button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button = (Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button is clicked!!",
//                        Toast.LENGTH_SHORT).show();
//                //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                //startActivity(intent);
//                Uri uri = Uri.parse("http://blog.csdn.net/eastmoon502136");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                //intent.setData(Uri.parse("http://blog.csdn.net/eastmoon502136"));
//                startActivity(intent);
//            }
//        });
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}

