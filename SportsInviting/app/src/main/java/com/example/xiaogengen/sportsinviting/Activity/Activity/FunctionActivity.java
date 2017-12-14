package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.xiaogengen.sportsinviting.R;

public class FunctionActivity extends AppCompatActivity {
    private Button btn;
    private ImageButton btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);


        btn=(Button)findViewById(R.id.button13);
        btn.setOnClickListener(new BtnClickListener());
        btn1=(ImageButton)findViewById(R.id.imageButton1);
        btn1.setOnClickListener(new BtnClickListener());
        btn2=(ImageButton) findViewById(R.id.imageButton2);
        btn2.setOnClickListener(new BtnClickListener());
        btn3=(ImageButton) findViewById(R.id.imageButton3);
        btn3.setOnClickListener(new BtnClickListener());
        btn4=(ImageButton) findViewById(R.id.imageButton4);
        btn4.setOnClickListener(new BtnClickListener());

    }
    class BtnClickListener implements View.OnClickListener{
        public void onClick(View v){
            switch (v.getId()){
                case R.id.button13:
                    Intent intent=new Intent(FunctionActivity.this,MeActivity.class);
                    startActivity(intent);
                    break;
                case R.id.imageButton1:
                case R.id.imageButton2:
                case R.id.imageButton3:
                case R.id.imageButton4:
                    Intent intent1=new Intent(FunctionActivity.this,Choose_gym.class);
                    startActivity(intent1);
                    break;
            }

        }

    }
}
