package kr.insungjung.jikbanglistviewpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

import kr.insungjung.jikbanglistviewpractice.adapter.RoomAdapter;
import kr.insungjung.jikbanglistviewpractice.databinding.ActivityMainBinding;
import kr.insungjung.jikbanglistviewpractice.datas.Room;

public class MainActivity extends AppCompatActivity {

    RoomAdapter mRoomAdapter;

    List<Room> roomList = new ArrayList<>();

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        fillRoom();

        mRoomAdapter = new RoomAdapter(MainActivity.this, roomList);
        act.roomListView.setAdapter(mRoomAdapter);
    }

    void fillRoom () {
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처)"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처)"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처)"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처)"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처)"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처)"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처)"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처)"));
    }
}
