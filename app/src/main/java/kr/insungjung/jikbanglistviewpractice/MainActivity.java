package kr.insungjung.jikbanglistviewpractice;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

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

        act.roomListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Room clickedRoomData = roomList.get(position);

                Intent intent = new Intent(MainActivity.this, RoomDetailActivity.class);
                intent.putExtra("방정보", clickedRoomData);
                startActivity(intent);
            }
        });
    }

    void fillRoom () {
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처","19.04.03", "확인매물", "월세"));
        roomList.add(new Room(100,15,3,"중개","경상북도 구미시 신평동","분리형 원룸","신평1동 사무소부근 깨끗깔끔합니다.","19.03.23", "확인매물", "월세"));
        roomList.add(new Room(100,13,3,"중개","경상북도 구미시 원평동","분리형 원룸","[풀옵션강력추천]먹자골목근처","19.01.20", "확인매물", "월세"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 형곡동","분리형 원룸","(풀옵션 초대박 원룸) 먹자골목근처","19.02.06", "확인매물", "월세"));
        roomList.add(new Room(100,15,2,"중개","경상북도 구미시 신평동","분리형 원룸","새출발 응원합니다.","19.04.03", "확인매물", "월세"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 송정동","분리형 원룸","(풀옵션 초대박 원룸) 번개시장근처","19.04.03", "확인매물", "월세"));
        roomList.add(new Room(100,15,3,"중개","경상북도 구미시 신평동","분리형 원룸","신평1동 사무소부근 깨끗깔끔합니다.","19.03.23", "확인매물", "월세"));
        roomList.add(new Room(100,13,3,"중개","경상북도 구미시 원평동","분리형 원룸","[풀옵션강력추천]먹자골목근처","19.01.20", "확인매물", "월세"));
        roomList.add(new Room(100,13,2,"중개","경상북도 구미시 형곡동","분리형 원룸","(풀옵션 초대박 원룸) 먹자골목근처","19.02.06", "확인매물", "월세"));
        roomList.add(new Room(100,15,2,"중개","경상북도 구미시 신평동","분리형 원룸","새출발 응원합니다.","19.04.03", "확인매물", "월세"));
    }
}
