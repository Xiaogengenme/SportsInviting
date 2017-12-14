package com.example.xiaogengen.sportsinviting.Activity.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.xiaogengen.sportsinviting.Activity.Adapter.InviteHistoryAdapter;
import com.example.xiaogengen.sportsinviting.Activity.Class.InviteHistory;
import com.example.xiaogengen.sportsinviting.R;

import java.util.ArrayList;
import java.util.List;

public class InviteHistoryActivity extends AppCompatActivity {

    private List<InviteHistory> friendList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFriends();
        InviteHistoryAdapter adapter = new InviteHistoryAdapter(InviteHistoryActivity.this,R.layout.invite_history_item,friendList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initFriends() {

        InviteHistory friendA =new InviteHistory("friendA", R.drawable.friend_a);
        friendList.add(friendA);
        InviteHistory friendB =new InviteHistory("friendB", R.drawable.friend_b);
        friendList.add(friendB);
        InviteHistory friendC =new InviteHistory("friendC", R.drawable.friend_c);
        friendList.add(friendC);


    }
}
