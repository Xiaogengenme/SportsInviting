package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.xiaogengen.sportsinviting.R;

public class MeActivity extends AppCompatActivity {
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        Button sentInvatation=(Button)findViewById(R.id.sentInvatation);
        Button recivedInvatation=(Button)findViewById(R.id.recivedInvatation);
        sentInvatation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MeActivity.this,InviteHistoryActivity.class);
                startActivity(intent);
            }
        });
        recivedInvatation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MeActivity.this,ChatHistoryActivity.class);
                startActivity(intent);
            }
        });





    }
}
