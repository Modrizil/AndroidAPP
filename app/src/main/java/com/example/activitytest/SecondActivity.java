package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondActivity","Task is is "+getTaskId());
        setContentView(R.layout.second_layout);
//        Intent intent=getIntent();
//        Log.d("SecondActivity", "onCreate: "+intent.getStringExtra("extra_data"));

        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
//                intent.putExtra("data_return", "Second - > First");
//                setResult(RESULT_OK, intent);
//                finish();
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity", "onDestroy");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Second - > First back_pressed");
        setResult(RESULT_OK, intent);
        finish();
    }
}
