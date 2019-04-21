package kr.insungjung.jikbanglistviewpractice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import kr.insungjung.jikbanglistviewpractice.R;
import kr.insungjung.jikbanglistviewpractice.datas.Room;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;

    public RoomAdapter(Context context, List<Room> list) {
        super(context, R.layout.app_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.app_list_item, null);
        }

        Room roomData = mList.get(position);

        TextView depositTxt = row.findViewById(R.id.paymentTxt);
        TextView floorTxt = row.findViewById(R.id.floorTxt);
        TextView addressTxt = row.findViewById(R.id.addressTxt);
        TextView roomType = row.findViewById(R.id.roomTypeTxt);
        TextView description = row.findViewById(R.id.descriptionTxt);

        depositTxt.setText(String.format("%d/%d", roomData.deposit));
        floorTxt.setText(String.format("%d층", roomData.floor));
        addressTxt.setText(roomData.address);
        roomType.setText(roomData.roomType);
        description.setText(roomData.description);

        return row;

    }

}
