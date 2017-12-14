package com.example.xiaogengen.sportsinviting.Activity.Class;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.xiaogengen.sportsinviting.R;

public class FriendList extends AppCompatActivity {


    private String[] data={"Tom","Tommy","TomCruise","TomHardy","Tom.Jr",
            "Micheal","Mike","Mikey","MicealJackson","MichealJordan","MichealJordan.Jr"
            ,"LiLi","LiLei","Lizhigen","Lizhigen.Jr","Ligengen","LuoQiFan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                FriendList.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
