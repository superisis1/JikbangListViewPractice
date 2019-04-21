package kr.insungjung.jikbanglistviewpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kr.insungjung.jikbanglistviewpractice.databinding.ActivityRoomDetailBinding;
import kr.insungjung.jikbanglistviewpractice.datas.Room;

public class RoomDetailActivity extends AppCompatActivity {

    ActivityRoomDetailBinding act;

    Room mRoomData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_detail);

        act = DataBindingUtil.setContentView(this, R.layout.activity_room_detail);

        mRoomData = (Room) getIntent().getSerializableExtra("방정보");

        act.itemCheckedAndDate.setText(String.format("%s %s", mRoomData.itemChecked, mRoomData.date));
        act.priceTxt.setText(String.format("%s %d/%d", mRoomData.paymentType, mRoomData.deposit, mRoomData.monthPay));
        act.descriptionTxt.setText(mRoomData.description);

    }
}
